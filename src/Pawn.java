import java.util.Scanner;

public class Pawn extends ChessPiece{
    public static Boolean movePawn(char side, int bX, int bY, int aX, int aY ) {

        boolean canPawnMoveAndIsItFirstMoveOfThePawn;
        boolean PosForwardsForY  = !existenceOfFigure('W', aX, aY) && !existenceOfFigure('B', aX, aY) && bY - aY == 0;

        switch(side){
                case 'W':
                    if (aX == 9){
                        transformPawnThatReachedEndOfTheBoard ('W', bX, bY);
                    }

                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 3 && bX - aX == -2 && PosForwardsForY || bX - aX == -1 && PosForwardsForY;
                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {

                        return true;
                    }
                   
                    return existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == 1 || existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == -1;
                case 'B':
                    if (aX == 2){
                        transformPawnThatReachedEndOfTheBoard ('B', bX, bY);
                    }

                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 8 && bX - aX == 2 && PosForwardsForY || bX - aX == 1 && PosForwardsForY;

                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {

                        return true;
                    }
                    return existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == 1 || existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == -1;

                default:
               return false;
        }
    }

     private static void transformPawnThatReachedEndOfTheBoard(char side, int X, int Y) {
         Scanner scan = new Scanner(System.in);
         String transformedPawn = "";
         switch (side) {
             case 'W':
                 System.out.println("Choose which piece will pawn transform into: R, H, B, Q ");
                 do {
                     transformedPawn = scan.next();
                 }while (!(transformedPawn.equals("R") || transformedPawn.equals("H") || transformedPawn.equals("B") || transformedPawn.equals("Q") ));

                 break;
             case 'B':
                 System.out.println("Choose which piece will pawn transform into: r, h, b, q ");
                 do {
                     transformedPawn = scan.next();
                 }while (!(transformedPawn.equals("r") || transformedPawn.equals("h") || transformedPawn.equals("b") || transformedPawn.equals("q") ));
                 break;
         }
         GameBoard.setGameBoard (X, Y, transformedPawn);

     }
}
