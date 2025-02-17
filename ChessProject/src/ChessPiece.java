public class ChessPiece {
    private static String [][] gameBoard ;

    //TODO: try to refactor these methods - diagonal, vertical

    public static boolean diagonal (char side, int bX, int bY, int aX, int aY) {
        int savedAX = aX, savedAY = aY;
        int posX = bX-aX;
        int posY = bY-aY;

        gameBoard = GameBoard.getGameBoard();
    if (posX < 0 && posY > 0){
            aY++;
            aX--;
        while (aX != bX) {
            if (!(gameBoard[aX][aY].equals("."))) {
                return false;
            }
            aY++;
            aX--;
        }
        return !existenceOfFigure(side, savedAX, savedAY);

    }
    else if (posX > 0 && posY > 0){
        aX++;
        aY++;
        while (aX != bX) {
            if (!(gameBoard[aX][aY].equals("."))) {
                return false;
            }
            aX++;
            aY++;
        }
        return !existenceOfFigure(side, savedAX, savedAY);
    }
    else if (posX < 0 && posY < 0){
            aY--;
            aX--;
        while (aX != bX) {
            if (!gameBoard[aX][aY].equals(".")) {
                return false;
            }
            aY--;
            aX--;
        } return !existenceOfFigure(side, savedAX, savedAY);
    }
    else if (posX > 0 && posY < 0){
            aY--;
            aX++;
        while (aX != bX) {
            if (!(gameBoard[aX][aY].equals("."))) {
                return false;
            }
            aY--;
            aX++;
        }

        return !existenceOfFigure(side, savedAX, savedAY);
    }
    return false;
}
    public static void deadOfKing (char side, int X, int Y) {
        switch (side){
            case 'W':
                if (gameBoard[X][Y].equals("K"))
                {
                    System.out.println("black side won");
                    System.exit(0);
                }

                break;
            case 'B':
                if (gameBoard[X][Y].equals("k"))
                {
                    System.out.println("white side won");
                    System.exit(0);
                }
                break;
        }

    }

    public static boolean verticals  (char side, int bX, int bY, int aX, int aY) {
       int savedAX = aX, savedAY = aY;
         int posX = bX-aX;
         int posY = bY-aY;
        if (posX < 0 && posY == 0){
            aX--;
            while (aX != bX) {
                if (!(gameBoard[aX][aY].equals("."))) {
                    return false;
                }
                aX--;
            }
            return !existenceOfFigure(side, savedAX, savedAY);
        }
        else if (posX > 0 && posY == 0){
            aX++;
            while (aX != bX) {
                if (!(gameBoard[aX][aY].equals("."))) {
                    return false;
                }
                aX++;
            }
            return !existenceOfFigure(side, savedAX, savedAY);
        }
        else if (posX == 0 && posY < 0){
            aY--;
            while (aY != bY) {
                if (!(gameBoard[aX][aY].equals("."))) {
                    return false;
                }
                aY--;
            }
            return !existenceOfFigure(side, savedAX, savedAY);
        }
        else if (posX == 0 && posY > 0){
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
        deadOfKing (side, X, Y);
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

