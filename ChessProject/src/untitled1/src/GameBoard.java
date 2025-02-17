package untitled1.src;

public class GameBoard {

    private static String [][] gameBoard;

    public static String[][] getGameBoard() {
        return gameBoard;
    }
    public static void setGameBoard (int x, int y, String thePoint) { gameBoard [x][y] = thePoint; }

    public static void setGameBoard(String[][] gameBoard) {
            try {
                GameBoard.gameBoard = gameBoard;
            }
            catch(Exception e) {
                System.out.println("Incorrect input");
            }
    }

    public static void createNewGameBoard() {
        gameBoard = new String[12][12];

        fillBoardEmptyAndBorders();
        addBorderPositionIndexes();
        placeChessPiecesOnBoard();
    }

    private static void fillBoardEmptyAndBorders()
    {
        String emptySymbol = ".";
        String horizontalBorderSymbol = "|| ";
        String verticalBorderSymbol = "= ";

        for(int i = 0; i < GameBoard.gameBoard.length; i++) {
            if(i == 1 || i == 10) {
                for(int j = 0; j < gameBoard.length; j++){
                    gameBoard[i][j] = verticalBorderSymbol;
                }
                continue;
            }
            for(int j = 0; j < gameBoard.length; j++){
                if(j == 1 || j == 10) {
                    gameBoard[i][j] = horizontalBorderSymbol;
                    continue;
                }
                gameBoard[i][j] = emptySymbol;
            }
        }
    }

    private static void addBorderPositionIndexes(){
        char positionLetter;
        for(int i = 0; i < gameBoard.length; i += 11) {
            for(int j = 2; j < 10; j++){
                positionLetter = (char) (64 + (j - 1));
                gameBoard[i][j] = String.valueOf(positionLetter) + " ";
            }
        }

        for(int i = 2; i < 10; i++) {
            gameBoard[i][0] = String.valueOf(i - 1) + " ";
        }
        for(int i = 2; i < 10; i++) {
            gameBoard[i][11] = String.valueOf(10-i) + " ";
        }
    }

    private static void placeChessPiecesOnBoard(){
        // Blacks:
        for(int i = 2; i < 10; i++) {
            gameBoard[3][i] = "Z";
        }
        gameBoard[2][2] = "R"; gameBoard[2][3] = "H"; gameBoard[2][4] = "B"; gameBoard[2][5] = "K"; gameBoard[2][6] = "Q"; gameBoard[2][7] = "B"; gameBoard[2][8] = "H"; gameBoard[2][9] = "R";

        // Whites:
        for(int i = 2; i < 10; i++) {
            gameBoard[8][i] = "x";
        }
        gameBoard[9][2] = "r"; gameBoard[9][3] = "h"; gameBoard[9][4] = "b"; gameBoard[9][5] = "q"; gameBoard[9][6] = "k"; gameBoard[9][7] = "b"; gameBoard[9][8] = "h"; gameBoard[9][9] = "r";
    }

    public static void drawGameBoard() {
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++){
                System.out.printf("%-3s", gameBoard[i][j]);
            }
            System.out.println();
        }

    }
}
