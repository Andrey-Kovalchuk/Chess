package untitled1.src;

import java.util.Objects;

public class King extends ChessPiece{
    private final static String[][] gameBoard = GameBoard.getGameBoard();

    public static boolean moveKing(char side, int bX, int bY, int aX, int aY ){
        if (Objects.equals(gameBoard[aX][aY], "K")) {
            return false;
        }
        return (Math.abs(aX - bX) == 1 || Math.abs(aY - bY) == 1) || (Math.abs(bX - aX) == 1 && Math.abs(bY - aY) == 1);

    }


}

