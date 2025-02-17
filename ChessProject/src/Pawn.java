public class Pawn extends ChessPiece{
    public static Boolean movePawn(char side, int bX, int bY, int aX, int aY ) {

        boolean canPawnMoveAndIsItFirstMoveOfThePawn;
        boolean PosForwardsForY  = !existenceOfFigure('W', aX, aY) && !existenceOfFigure('B', aX, aY) && bY - aY == 0;

        switch(side){
                case 'W':
                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 3 && bX - aX == -2 && PosForwardsForY || bX - aX == -1 && PosForwardsForY;
                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {
                        return true;
                    }
                    return existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == 1 || existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == -1;
                case 'B':
                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 8 && bX - aX == 2 && PosForwardsForY || bX - aX == 1 && PosForwardsForY;

                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {
                        return true;
                    }
                    return existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == 1 || existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == -1;

                default:
               return false;
        }
    }


}
