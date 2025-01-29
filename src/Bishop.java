public class Bishop {


    public Bishop() {

    }

    private static String [][] Bishop (String [][] desk, int bX, int bY, int aX, int aY) {
        if ((aX >= 3 && aY >= 3) && (aX <= 10 && aY <= 3) && (aX >= 3 && aY <= 10) && (aX <= 10 && aY <=10))  {
            return desk;
        }
        if (bX == bX && aY == aY)
            return desk;
        int tempForRevise;
        int tempForRevise2;
        if (bX - aX == bY - aY) { // а = 3. б=5 -- в с = 5. д = 7        2 2
            tempForRevise = aX;
            tempForRevise2 = aY;

            if ((aX - bX > 0) && (aY - bY > 0)) {
                while (bX != aX && bY != aY) {
                    if (!desk[aX][aY].equals(" ")) {
                        return desk;
                    }
                    aX--;
                    aY--;
                }

                aX = tempForRevise;
                aY = tempForRevise2;
                desk[aX][aY] = "B";
                desk[bX][bY] = " ";
                return desk;
            } else if ((aX - bX > 0) && (aY + bY < 0)) {
                while (bX != aX && bY != aY) {
                    if (!desk[aX][aY].equals(" ")) {
                        return desk;
                    }
                    aX--;
                    aY++;
                }

                aX = tempForRevise;
                aY = tempForRevise2;
                desk[aX][aY] = "B";
                desk[bX][bY] = " ";
                return desk;
            } else if ((aX - bX < 0) && (aY + bY > 0)) {
                while (bX != aX && bY != aY) {
                    if (!desk[aX][aY].equals(" ")) {
                        return desk;
                    }
                    aX++;
                    aY--;
                }

                aX = tempForRevise;
                aY = tempForRevise2;
                desk[aX][aY] = "B";
                desk[bX][bY] = " ";
                return desk;
            } else if ((aX - bX < 0) && (aY + bY < 0)) {
                while (bX != aX && bY != aY) {
                    if (!desk[aX][aY].equals(" ")) {
                        return desk;
                    }
                    aX++;
                    aY++;
                }

                aX = tempForRevise;
                aY = tempForRevise2;
                desk[aX][aY] = "B";
                desk[bX][bY] = " ";
                return desk;
            }
        }
     return desk;
    }
}
