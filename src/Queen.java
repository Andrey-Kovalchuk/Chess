public class Queen extends ChessPiece {

    public static Boolean getMoveQueen (int side, int aX, int aY, int bX, int bY ) {
        return moveQueen(side, bX, bY, aX, aY);
    }

    private static Boolean moveQueen(int side, int bX, int bY, int aX, int aY ) {
        if (!((bX - aX != 0) && (bY - aY != 0))) {
            return (verticals(side, bX, bY, aX, aY));
        }
        else if (bX - aX == bY - aY || bX - aX == (-1)*(bY - aY)){
            return  (diagonal(side, bX, bY, aX, aY));
        }
    return false;
    }
}
