public class Bishop extends ChessPiece {
    private int side;


    public static Boolean getMoveBishop (int side, int aX, int aY, int bX, int bY ) {
        return moveBishop(side, bX, bY, aX, aY);
    }

   private static Boolean moveBishop(int side, int bX, int bY, int aX, int aY ) {

        if (!(bX - aX == bY - aY || bX - aX == (-1)*(bY - aY))){    // 2 6  --- 6  10  \\ 9 5 --> 5 9   9 6   5 2
          return false;
        }

       return (diagonal(side, bX, bY, aX, aY));

   }


}

