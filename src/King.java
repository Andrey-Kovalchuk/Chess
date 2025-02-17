import java.util.Objects;

public class King extends ChessPiece{
    private final static String[][] gameBoard = GameBoard.getGameBoard();

    public static boolean moveKing(char side, int bX, int bY, int aX, int aY ){
        boolean isKingTryingToCastle;
        boolean canKingShortCastle, canKingLongCastle;

        if (Objects.equals(gameBoard[aX][aY], "K")) {
            return false;
        }
        if((Math.abs(aX - bX) == 1 || Math.abs(aY - bY) == 1) || (Math.abs(bX - aX) == 1 && Math.abs(bY - aY) == 1)){
            GameBoard.flagBoard[bX][bY] = true;
            return true;
        }

        isKingTryingToCastle = !GameBoard.flagBoard[bX][bY] && bX - aX == 0 && Math.abs(bY - aY) == 2;
        if(isKingTryingToCastle){
            castleKingPiece(side, bX, bY, aX, aY);
            return true;
        }
        return false;
    }
}

