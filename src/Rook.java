public class Rook extends ChessPiece{

    public static Boolean getMoveRook (int side, int aX, int aY, int bX, int bY ) {
        return moveRook(side, bX, bY, aX, aY);
    }

    private static Boolean moveRook(int side, int bX, int bY, int aX, int aY ) {

        if ((bX - aX != 0) && (bY - aY != 0)) {
            return false;
        }


        return (verticals(side, bX, bY, aX, aY));

    }

}
