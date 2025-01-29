public class Castle {

     private static String [] [] castle(String [][] desk, int bX, int bY, int aX, int aY) {
         int tempForRevise;
         if ((aX >= 3 && aY >= 3) && (aX <= 10 && aY <= 3) && (aX >= 3 && aY <= 10) && (aX <= 10 && aY <=10))  {
             return desk;
         }
         if (bX == bX && aY == aY) {
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
