public class Castle {

     private static String [] [] castle(String [][] desk, int bX, int bY, int aX, int aY) {
         int tempForRevise;
         if (aX<2   || aX > 11  || aY< 2 || aY > 11 )  {
             return desk;
         }
         if (bX == aX && bY == aY) {
             return desk;
         } else if (bX == aX) {
             tempForRevise = aY;
             if (aY > bY) {
                 while (bY != aY) {
                     if (!desk[aX][aY].equals(" ")) {
                         return desk;
                     }
                     aY--;
                 }
             } else {
                 if (aY < bY) {
                     while (bY != aY) {
                         if (!desk[aX][aY].equals(" ")) {
                             return desk;
                         }
                         aY++;
                     }

                 }
             }
             aY = tempForRevise;

             desk[bX][bY] = " ";
             desk[aX][aY] = "C";
             return desk;
         } else if (bY == aY) {
             tempForRevise = aX;
             if (aX > bX) {
                 while (bX != aX) {
                     if (!desk[aX][aY].equals(" ")) {
                         return desk;
                     }
                     aX--;
                 }
             } else {
                 if (aX < bX) {
                     while (bX != aX) {
                         if (!desk[aX][aY].equals(" ")) {
                             return desk;
                         }
                         aX++;
                     }

                 }
             }
             aX = tempForRevise;

             desk[bX][bY] = " ";
             desk[aX][aY] = "C";
             return desk;

         }
        return desk;
     }
}
