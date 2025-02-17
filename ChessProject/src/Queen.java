public class Queen extends ChessPiece {
    public static Boolean moveQueen(char side, int bX, int bY, int aX, int aY ) {
        if ((bX - aX != 0 && bY - aY == 0) || (bX - aX == 0 && bY - aY != 0) ) {
            return (verticals(side, bX, bY, aX, aY));
        }
        else if (Math.abs(bX - aX) == Math.abs(bY - aY)){
            return  (diagonal(side, bX, bY, aX, aY));
        }
    return false;
    }
}
