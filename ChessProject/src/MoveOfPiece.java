import java.util.Scanner;

public class MoveOfPiece {
    private static String pieceInRow;
    private static int aX;
    private static int aY;
    private static int bX;
    private static int bY;
    private static String[][] gameBoard;

    public static void main (String[] args) {
        GameBoard.createNewGameBoard();
        GameBoard.drawGameBoard();
        playInChess();
    }

    public static void playInChess() {
        int turnToMove = 1;

        messageForUser();
        while (turnToMove < 1000) {
            gameBoard = GameBoard.getGameBoard();
            if (turnToMove % 2 == 1) {  // white
                System.out.println("Enter a move for white side (BIG LETTER): ");
                confirmThatChosenPieceIsValid('W');
                chooseMove('W');

            } else if (turnToMove % 2 == 0) { // black
                System.out.println("Enter a move for black side (small letter): ");
                confirmThatChosenPieceIsValid('B');
                chooseMove('B');
            }
            clearConsole();
            updateGameBoardVisuals();
            GameBoard.drawGameBoard();
            turnToMove++;

        }
        System.out.println("friendship won");
    }

    private static void updateGameBoardVisuals() {
        GameBoard.setGameBoard(bX, bY, ".");
        GameBoard.setGameBoard(aX, aY, pieceInRow);

    }

    private static void chooseMove(char side) {
        String notFinishedY;
        boolean correctUserInput;
        Scanner scan = new Scanner(System.in);

        System.out.println("were would you like to move a piece? (Number 1-8, letter A-H): ");
        boolean isInputCorrect = false;
        do {
            do {
                aX = scan.nextInt();
                notFinishedY = scan.next();
                correctUserInput = checkXandYForCorrectInput(aX, notFinishedY);

                if (!correctUserInput) {
                    continue;
                }

                aX += 1;
                aY = notFinishedY.charAt(0) - 64 + 1;
            } while (!correctUserInput);

            if (!ChessPiece.CheckATypeOfFigure(side, bX, bY, aX, aY)) {
                System.out.println("your input is incorrect, please try again");
                isInputCorrect = false;
                continue;
            }
            isInputCorrect = true;
        } while (!isInputCorrect);
        pieceInRow = gameBoard[bX][bY];
    }


    private static void confirmThatChosenPieceIsValid(char player) {
        boolean correctUserInput;
        String notFinishedY;
        Scanner scan = new Scanner(System.in);
            do {
                bX = scan.nextInt();
                notFinishedY = scan.next();
                correctUserInput = checkXandYForCorrectInput(bX, notFinishedY);

                if (!correctUserInput) {
                    continue;
                }

                bX += 1;
                bY = notFinishedY.charAt(0) - 64 + 1;

            } while (!ChessPiece.existenceOfFigure(player, bX, bY));
    }

    private static void messageForUser() {
        System.out.println("Whites are moving first");
        System.out.println("Choose a piece to move (First number 1-8, and letter A-H):");
    }
    private static void clearConsole()
    {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

    private static boolean checkXandYForCorrectInput(int x, String y)
    {
        if(x < 1 || x > 8)
        {
            return false;
        }
        return y.matches("[A-H]");
    }

}
