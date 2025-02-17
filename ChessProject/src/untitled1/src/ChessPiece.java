package untitled1.src;

public class ChessPiece {
    private static String [][] gameBoard ;

    //TODO: try to refactor these methods - diagonal, vertical

    public static boolean diagonal (char side, int bX, int bY, int aX, int aY) {
        int savedAX = aX, savedAY = aY;
    gameBoard = GameBoard.getGameBoard();
    if (bX-aX < 0 && bY-aY > 0){
        while (aX != bX) {
            aX--;
            aY++;
            if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                return false;
            }
        }
        return !existenceOfFigure(side, savedAX, savedAY);

    }
    else if (bX-aX > 0 && bY-aY > 0){
        while (aX != bX) {
            aX++;
            aY++;
            if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                return false;
            }
        }
        return !existenceOfFigure(side, savedAX, savedAY);
    }
    else if (bX-aX < 0 && bY-aY < 0){
        while (aX != bX) {
            aX--;
            aY--;
            if (!(gameBoard[aX][aY].equals(".")) && gameBoard[aX][aY].equals("B")) {
                return false;
            }
        } return !existenceOfFigure(side, savedAX, savedAY);
    }
    else if (bX-aX > 0 && bY-aY < 0){
        while (aX != bX) {
            aX++;
            aY--;
            if (!(gameBoard[aX][aY].equals(".")) && aX != bX) {
                return false;
            }
        }return !existenceOfFigure(side, savedAX, savedAY);
    }
    return false;
}


    public static boolean verticals  (char side, int bX, int bY, int aX, int aY) {
       int savedAX = aX, savedAY = aY;

        if (bX-aX < 0 && bY-aY == 0){
            aX--;
            while (aX != bX) {
                if (!(gameBoard[aX][aY].equals("."))) {
                    return false;
                }
                aX--;
            }
            return !existenceOfFigure(side, savedAX, savedAY);
        }
        else if (bX-aX > 0 && bY-aY == 0){
            aX++;
            while (aX != bX) {
                if (!(gameBoard[aX][aY].equals("."))) {
                    return false;
                }
                aX++;
            }
            return !existenceOfFigure(side, savedAX, savedAY);
        }
        else if (bX-aX == 0 && bY-aY < 0){
            aY--;
            while (aY != bY) {
                if (!(gameBoard[aX][aY].equals("."))) {
                    return false;
                }
                aY--;
            }
            return !existenceOfFigure(side, savedAX, savedAY);
        }
        else if (bX-aX == 0 && bY-aY > 0){
            aY++;
            while (aY != bY) {
                if (!(gameBoard[aX][aY].equals("."))) {
                    return false;
                }
                aY++;
            }
            return !existenceOfFigure(side, savedAX, savedAY);
        }
        return false;
    }

    public static boolean existenceOfFigure(char side , int X, int Y) {
        gameBoard = GameBoard.getGameBoard();
        System.out.println(gameBoard[X][Y]);
        return switch (side) {
            case 'W' ->  // black piece
                    switch (gameBoard[X][Y]) {
                        case "R" -> true;
                        case "H" -> true;
                        case "B" -> true;
                        case "Q" -> true;
                        case "K" -> true;
                        case "Z" -> true;
                        default -> false;
                    };
            case 'B' -> // white piece
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

    public static boolean CheckATypeOfFigure (char side, int bX, int bY, int aX, int aY) {
        gameBoard = GameBoard.getGameBoard();
        return switch (side) {
            case 'W' ->  // white
                    switch (gameBoard[bX][bY]) {
                        case "R" -> Rook.moveRook(side, bX,  bY, aX,  aY );
                        case "H" -> Knight.moveKnight(side, bX,  bY, aX,  aY );
                        case "B" -> Bishop.moveBishop(side, bX,  bY, aX,  aY );
                        case "Q" -> Queen.moveQueen(side, bX,  bY, aX,  aY );
                        case "K" -> King.moveKing(side, bX,  bY, aX,  aY );
                        case "Z" -> Pawn.movePawn(side, bX,  bY, aX,  aY );
                        default -> false;
                    };
            case 'B' -> // black
                    switch (gameBoard[bX][bY]) {
                        case "r" -> Rook.moveRook(side, bX,  bY, aX,  aY );
                        case "h" -> Knight.moveKnight(side, bX,  bY, aX,  aY );
                        case "b" -> Bishop.moveBishop(side, bX,  bY, aX,  aY );
                        case "q" -> Queen.moveQueen(side, bX,  bY, aX,  aY );
                        case "k" -> King.moveKing(side, bX,  bY, aX,  aY );
                        case "x" -> Pawn.movePawn(side, bX,  bY, aX,  aY );
                        default -> false;

                    };
            default -> false;
        };

    }


}

