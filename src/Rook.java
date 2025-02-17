public class Rook extends ChessPiece{
    public static Boolean moveRook(char side, int bX, int bY, int aX, int aY ) {
        if ((bX - aX != 0) && (bY - aY != 0)) {
            return false;
        }
        if(verticals(side, bX, bY, aX, aY)){
            GameBoard.flagBoard[bX][bY] = true;
            return true;
        }
        return false;
    }
}
