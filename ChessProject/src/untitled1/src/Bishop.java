package untitled1.src;

public class Bishop extends ChessPiece {
    private int side;

   public static Boolean moveBishop(char side, int bX, int bY, int aX, int aY ) {
 // TODO: FIX this method
        if (!(Math.abs(bX - aX) == Math.abs(bY - aY))){    // 2 6  --- 6  10  \\ 9 5 --> 5 9   9 6   5 2
          return false;
        }

       return (diagonal(side, bX, bY, aX, aY));
   }
}

