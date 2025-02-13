public class ChessPiece {
    private static String [][] gameBoard ;

    public static boolean diagonal (int side, int bX, int bY, int aX, int aY) {
    gameBoard = GameBoard.getGameBoard();
    if (bX-aX < 0 && bY-aY > 0){
        while (aX != bX) {
            aX--;
            aY++;
            if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                return false;
            }
        }
        return true;

    }
    else if (bX-aX > 0 && bY-aY > 0){
        while (aX != bX) {
            aX++;
            aY++;
            if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                return false;
            }
        }
        return true;
    }
    else if (bX-aX < 0 && bY-aY < 0){
        while (aX != bX) {
            aX--;
            aY--;
            if (!(gameBoard[aX][aY].equals(".")) && gameBoard[aX][aY].equals("B")) {
                return false;
            }
        } return true;
    }
    else if (bX-aX > 0 && bY-aY < 0){
        while (aX != bX) {
            aX++;
            aY--;
            if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                return false;
            }
        }return true;
    }
    return false;
}
    public static boolean verticals  (int side, int bX, int bY, int aX, int aY) {

        if (bX-aX < 0 && bY-aY == 0){
            while (aX != bX) {
                aX--;

                if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                    return false;
                }
            }
            return true;

        }
        else if (bX-aX > 0 && bY-aY == 0){
            while (aX != bX) {
                aX++;
                if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                    return false;
                }
            }
            return true;
        }
        else if (bX-aX == 0 && bY-aY < 0){
            while (aY != bY) {
                aY--;
                if (!(gameBoard[aX][aY].equals(".")) && aY != bY) {
                    return false;
                }
            } return true;
        }
        else if (bX-aX == 0 && bY-aY > 0){
            while (aY != bY) {
                aY++;
                if (!(gameBoard[aX][aY].equals(".")) && aY != bY) {
                    return false;
                }
            }return true;
        }
        return false;


    }
    public static boolean getExistenceOfFigure(int side , int X, int Y){
        return existenceOfFigure(side ,  X, Y);
    }
    private static boolean existenceOfFigure(int side , int X, int Y) {
        gameBoard = GameBoard.getGameBoard();
        return switch (side) {
            case 1 ->  // black piece
                    switch (gameBoard[X][Y]) {
                        case "R" -> true;
                        case "H" -> true;
                        case "B" -> true;
                        case "Q" -> true;
                        case "K" -> true;
                        case "Z" -> true;
                        default -> false;
                    };
            case 2 -> // white piece
                    switch (gameBoard[X][Y]) {
                        case "r" -> true;
                        case "h" -> true;
                        case "b" -> true;
                        case "q" -> true;
                        case "k" -> true;
                        case "x" -> true;
                        default -> false;

                    };
            default -> false;
        };

    }

    public static boolean getCheckForKing (int x, int y){
    return checkForKing(x, y);
    }
    private static boolean checkForKing (int x, int y){
        gameBoard = GameBoard.getGameBoard();
    return (gameBoard[x][y].equals("K"));
    }
    public static boolean getCheckATypeOfFigure (int side, int bX, int bY, int aX, int aY) {
        return CheckATypeOfFigure(side, bX, bY,  aX,  aY);
    }
    private static boolean CheckATypeOfFigure (int side, int bX, int bY, int aX, int aY) {
        gameBoard = GameBoard.getGameBoard();
        return switch (side) {
            case 1 ->  // black piece
                    switch (gameBoard[bX][bY]) {
                        case "R" -> Rook.getMoveRook (side, aX,  aY, bX,  bY );
                        case "H" -> Knight.getMoveKnight (side, aX,  aY, bX,  bY );
                        case "B" -> Bishop.getMoveBishop (side, aX,  aY, bX,  bY );
                        case "Q" -> Queen.getMoveQueen (side, aX,  aY, bX,  bY );
                        case "K" -> King.getMoveKing (side, aX,  aY, bX,  bY );
                        case "Z" -> Pawn.getMovePawn (side, aX,  aY, bX,  bY );
                        default -> false;
                    };
            case 2 -> // white piece
                    switch (gameBoard[bX][bY]) {
                        case "r" -> Rook.getMoveRook (side, aX,  aY, bX,  bY );
                        case "h" -> Knight.getMoveKnight (side, aX,  aY, bX,  bY );
                        case "b" -> Bishop.getMoveBishop (side, aX,  aY, bX,  bY );
                        case "q" -> Queen.getMoveQueen (side, aX,  aY, bX,  bY );
                        case "k" -> King.getMoveKing (side, aX,  aY, bX,  bY );
                        case "x" -> Pawn.getMovePawn (side, aX,  aY, bX,  bY );
                        default -> false;

                    };
            default -> false;
        };

    }

}

