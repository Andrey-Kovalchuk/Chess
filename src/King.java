public class King extends ChessPiece{

    public static boolean getMoveKing(int side, int aX, int aY, int bX, int bY ) {
        return MoveKing(side, bX, bY, aX, aY);
    }

    private static boolean MoveKing(int side, int aX, int aY, int bX, int bY ){
        if (getCheckForKing(aX, bY)) {
            return false;
        }
        return (((aX-bX == 1) || (aX-bX == -1)) && ((aY-bY == 1) || (aY-bY == -1)));

    }


}

