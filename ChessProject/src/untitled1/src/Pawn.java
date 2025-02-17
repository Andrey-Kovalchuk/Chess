package untitled1.src;

public class Pawn extends ChessPiece{
    public static Boolean movePawn(char side, int bX, int bY, int aX, int aY ) {

        //TODO: Refactor this method

        boolean canPawnMoveAndIsItFirstMoveOfThePawn;
        boolean isPositionForwardIsOccupied;
        boolean canPawnEatEnemy;
        switch(side){
                case 'W':
                    isPositionForwardIsOccupied = !existenceOfFigure('W', aX, aY) && !existenceOfFigure('B', aX, aY);
                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 3 && bX - aX == -2 && isPositionForwardIsOccupied && bY - aY == 0 || bX - aX == -1 && isPositionForwardIsOccupied && bY - aY == 0;
                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {
                        return true;
                    }
                    canPawnEatEnemy = existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == 1 || existenceOfFigure('B', aX, aY) && bX - aX == -1 && bY - aY == -1;
                    if(canPawnEatEnemy)
                    {
                        return true;
                    }
                 return false;

                case 'B':
                    isPositionForwardIsOccupied = !existenceOfFigure('W', aX, aY) && !existenceOfFigure('B', aX, aY);
                    canPawnMoveAndIsItFirstMoveOfThePawn = bX == 8 && bX - aX == 2 && isPositionForwardIsOccupied && bY - aY == 0 || bX - aX == 1 && isPositionForwardIsOccupied && bY - aY == 0;
                    if (canPawnMoveAndIsItFirstMoveOfThePawn) {
                        return true;
                    }
                    canPawnEatEnemy = existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == 1 || existenceOfFigure('W', aX, aY) && bX - aX == 1 && bY - aY == -1;
                    if (canPawnEatEnemy){
                     return true;
                    }
                    return false;

                default:
               return false;
        }

    }


}
