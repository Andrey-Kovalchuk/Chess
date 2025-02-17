package untitled1.src;

public class Knight extends ChessPiece {
    public static Boolean moveKnight(char side, int bX, int bY, int aX, int aY) {
        if (Math.abs(bX - aX) == 2 && Math.abs(bY - aY) == 1) {
            return !existenceOfFigure(side, aX, aY);
        }
        if (Math.abs(bY - aY) == 2 && Math.abs(bX - aX) == 1) {
            return !existenceOfFigure(side, aX, aY);
        }
        return false;
    }
}