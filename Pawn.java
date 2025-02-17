import java.util.Scanner;

public class Pawn extends ChessPiece{
    public static Boolean movePawn(char side, int bX, int bY, int aX, int aY ) {

        boolean canPawnMoveAndIsItFirstMoveOfThePawn;
        boolean PosForwardsForY  = !existenceOfFigure('W', aX, aY) && !existenceOfFigure('B', aX, aY) && bY - aY == 0;

        switch(side){
                case 'W':
                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 3 && bX - aX == -2 && PosForwardsForY || bX - aX == -1 && PosForwardsForY;
                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {
                        if (aX == 8){
                            anatherSideOfPown ('W', aX, aY);
                        }
                        return true;
                    }
                   
                    return existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == 1 || existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == -1;
                case 'B':
                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 8 && bX - aX == 2 && PosForwardsForY || bX - aX == 1 && PosForwardsForY;

                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {
                        if (aX == 1){
                            anatherSideOfPown ('B', aX, aY);
                        }
                        return true;
                    }
                    return existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == 1 || existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == -1;

                default:
               return false;
        }
    }
     private static void anatherSideOfPown (char side, int X, int Y) {
         Scanner scan = new Scanner(System.in);
         String newLifeOfPown = "";
         switch (side) {
             case 'W':
                 System.out.println("Choose figure for muted a pawn R, H, B, Q ");
                 do {
                     newLifeOfPown = scan.next();
                 }while (!(newLifeOfPown.equals("R") || newLifeOfPown.equals("H") || newLifeOfPown.equals("B") || newLifeOfPown.equals("Q") ));

                 break;
             case 'B':
                 System.out.println("Choose figure for muted a pawn r, h, b, q ");
                 do {
                     newLifeOfPown = scan.next();
                 }while (!(newLifeOfPown.equals("r") || newLifeOfPown.equals("h") || newLifeOfPown.equals("b") || newLifeOfPown.equals("q") ));
                 break;
         }
         GameBoard.setGameBoard (X, Y, newLifeOfPown);

     }
}
