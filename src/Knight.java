public class Knight extends ChessPiece {

    public static Boolean getMoveKnight (int side, int aX, int aY, int bX, int bY ) {
        return moveKnight(side, bX, bY, aX, aY);
    }
    private static Boolean moveKnight(int side, int bX, int bY, int aX, int aY ) {
        if (bX-aX == 2) {
            if (bY-aY == 1) {
                return true;
            }
            else return (bY - aY == -1);
        }
        else if (bX-aX == -2) {
            if (bY-aY == 1) {
                return true;
            }
            else return (bY - aY == -1);
        } if (bY-aY == 2) {
            if (bX-aX == 1) {
                return true;
            }
            else return (bX - aX == -1);
        }
        else if (bY-aY == -2) {
            if (bX-aX == 1) {
                return true;
            }
            else return (bX - aX == -1);
        }
        return false;
    }
}