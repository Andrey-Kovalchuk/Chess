public class Pawn extends ChessPiece{

    public static boolean getMovePawn(int side, int aX, int aY, int bX, int bY ) {
        return movePawn(side, bX, bY, aX, aY);
    }
    private static Boolean movePawn(int side, int bX, int bY, int aX, int aY ) {
        switch(side){
                case 1:
                    if (bX == 3 && bX - aX == -2 && !getExistenceOfFigure(2, aX, aY) && !getExistenceOfFigure(1, aX, aY)) {
                        return true;
                    }
                    if (getExistenceOfFigure(2, aX, aY)){
                        return true;
                    }
                 return (bX == aX && bY - aY == -1 && !getExistenceOfFigure(2, aX, aY) && !getExistenceOfFigure(1, aX, aY));

                case 2:
                    if (bX == 3 && bX - aX == 2 && !getExistenceOfFigure(2, aX, aY) && !getExistenceOfFigure(1, aX, aY)) {
                        return true;
                    }
                    if (getExistenceOfFigure(1, aX, aY)){
                     return true;
                    }
                    return (bX == aX && bY - aY == 1 && !getExistenceOfFigure(2, aX, aY) && !getExistenceOfFigure(1, aX, aY));

                default:
               return false;
        }

    }


}
