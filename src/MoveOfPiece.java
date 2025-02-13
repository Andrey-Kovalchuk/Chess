import java.util.Scanner;

public class MoveOfPiece {
    private  int turnToMove;
    private static String pieceInRow;
    private static int aX;
    private static int aY;
    private static int bX;
    private static int bY;
    private static String [][] gameBoard ;

    public MoveOfPiece(){
        this.turnToMove = 1;
    }



    public void playInChess () {
        messengeForUser ();
        Scanner scan = new Scanner(System.in);
        while (turnToMove < 1000){
            gameBoard = GameBoard.getGameBoard();
            if (turnToMove%2 == 1){  // white
                System.out.println("Enter a move for white side (BIG LETTER): ");
                chooseAPiece(1);
                chooseMove (1);

            }
            else if (turnToMove%2 == 0) { // black
                System.out.println("Enter a move for black side (small letter): ");
                chooseAPiece(0);
                chooseMove(0);
            }
            clearConsole();
            rePainTheGameBoard ();
            GameBoard.drawGameBoard();
            turnToMove++;

        }
        System.out.println("friendship won");
    }
    private static void rePainTheGameBoard () {
        GameBoard.setGameBoard(bX, bY, ".");
        GameBoard.setGameBoard(aX, aY, pieceInRow);

    }
  private void chooseMove (int side) {
        // call class of figure that should return true if move is pasible or false if it unreal
      Scanner scan = new Scanner(System.in);
      System.out.println("were would you like to move a piece? (pos x and y): ");
      int incorrectInput;
      do {
          incorrectInput = 0;
          aX = scan.nextInt();
          aY = scan.nextInt();
          if (checkEnter(aX, aY)){
              incorrectInput++;
          }

          if (!ChessPiece.getCheckATypeOfFigure(side, bX, bY, aX, aY)){
              System.out.println("your input is incorrect, please try again");
              incorrectInput++;
          }
      }while (incorrectInput == 1);
      pieceInRow = gameBoard[aX][aY];
  }


   private void chooseAPiece(int player) {
        Scanner scan = new Scanner(System.in);

           if (player == 1){
               do {
                   bX = scan.nextInt()+2;
                   bY = scan.nextInt()+2;

               }while (!ChessPiece.getExistenceOfFigure (1, bX, bY));
           }
           else if (player == 0){
               do {
               bX = scan.nextInt()+2;
               bY = scan.nextInt()+2;
               }while (!ChessPiece.getExistenceOfFigure (0, bX, bY));
           }
   }

    private boolean checkEnter(int x, int y) {
        return ( x > 2 && x < 10 && y > 1 && y < 10);
    }
    private void messengeForUser () {
        System.out.println("game started");
        System.out.println("first move is keep by white");
        System.out.println("enter only number from 1 to 8, do not try to write a letter");
        System.out.println("Enter symbol in format | Number Number | ");
    }
    private static void clearConsole()
    {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

}
