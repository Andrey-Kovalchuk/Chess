public class GameBoard {

    private static String [][] gameBoard;

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String[][] gameBoard) {
            try {
                GameBoard.gameBoard = gameBoard;
            }
            catch(Exception e) {
                System.out.println("Incorrect input");
            }
    }

    public void createNewGameBoard() {
        gameBoard = new String[12][12];

        fillBoardEmptyAndBorders();
        addBorderPositionIndexes();
        placeChessPiecesOnBoard();
    }

    private void fillBoardEmptyAndBorders()
    {
        String emptySymbol = ". ";
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

    private void addBorderPositionIndexes(){
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

    private void placeChessPiecesOnBoard(){
        // Blacks:
        for(int i = 2; i < 10; i++) {
            gameBoard[3][i] = "♟";
        }
        gameBoard[2][2] = "♜"; gameBoard[2][3] = "♞"; gameBoard[2][4] = "♝"; gameBoard[2][5] = "♛"; gameBoard[2][6] = "♚"; gameBoard[2][7] = "♝"; gameBoard[2][8] = "♞"; gameBoard[2][9] = "♜";

        // Whites:
        for(int i = 2; i < 10; i++) {
            gameBoard[8][i] = "♙";
        }
        gameBoard[9][2] = "♖"; gameBoard[9][3] = "♘"; gameBoard[9][4] = "♗"; gameBoard[9][5] = "♔"; gameBoard[9][6] = "♕"; gameBoard[9][7] = "♗"; gameBoard[9][8] = "♘"; gameBoard[9][9] = "♖";
    }

    public void drawGameBoard() {
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++){
                System.out.printf("%-3s", gameBoard[i][j]);
            }
            System.out.println();
        }
    }
}
