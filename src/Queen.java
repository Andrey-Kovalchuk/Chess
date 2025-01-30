public class Queen {

    public Queen() {

    }

    private String[][] moveQ (String [][] desk, int bX, int bY, int aX, int aY) {
        int tempForRevise;
        int tempForRevise2;
        if (aX<2   || aX > 11  || aY< 2 || aY > 11 )  {
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
            desk[aX][aY] = "Q";
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
            desk[aX][aY] = "Q";
            return desk;
        } else if (bX-aX == bY-aY){ // а = 3. б=5 -- в с = 5. д = 7        2 2
          tempForRevise = aX;
          tempForRevise2 = aY;

            if ((aX-bX >0) && (aY-bY > 0)  ){
             while (bX != aX && bY != aY) {
                 if (!desk[aX][aY].equals(" ")) {
                    return desk;
                 }
                 aX--;
                 aY--;
             }

             aX = tempForRevise;
             aY = tempForRevise2;
             desk[aX][aY] = "Q";
             desk[bX][bY] = " ";
             return desk;
            }else if ((aX-bX >0) && (aY+bY < 0)  ) {
                while (bX != aX && bY != aY) {
                    if (!desk[aX][aY].equals(" ")) {
                        return desk;
                    }
                    aX--;
                    aY++;
                }

                aX = tempForRevise;
                aY = tempForRevise2;
                desk[aX][aY] = "Q";
                desk[bX][bY] = " ";
                return desk;
            } else if ((aX-bX <0) && (aY+bY > 0)  ) {
                while (bX != aX && bY != aY) {
                    if (!desk[aX][aY].equals(" ")) {
                        return desk;
                    }
                    aX++;
                    aY--;
                }

                aX = tempForRevise;
                aY = tempForRevise2;
                desk[aX][aY] = "Q";
                desk[bX][bY] = " ";
                return desk;
            }else if ((aX-bX <0) && (aY+bY < 0)  ) {
                while (bX != aX && bY != aY) {
                    if (!desk[aX][aY].equals(" ")) {
                        return desk;
                    }
                    aX++;
                    aY++;
                }

                aX = tempForRevise;
                aY = tempForRevise2;
                desk[aX][aY] = "Q";
                desk[bX][bY] = " ";
                return desk;
            }

        }

        return desk;
    }



}
