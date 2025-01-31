public class Knight {
     static int bX;
     static int aX;
     static int bY;
     static int aY;
     static String[][] desk;
    private String[][] Knight(String[][] desk, int bX, int bY, int aX, int aY) {
         this.bX = bX;
         this.bY = bY;
         this.aX = aX;
         this.aY = aY;
         this.desk = desk;
        if (bX == aX && bY == aY)
            return desk;
        if (aX<2   || aX > 11  || aY< 2 || aY > 11 )  {
            return desk;
        }
        if (bX-aX == 2) {
            if (bY-aY == 1) {
                loadChenges();
            }
            else if (bY-aY == -1) {
                loadChenges();
            } else {
                return desk;
            }
        }
        else if (bX-aX == -2) {
            if (bY-aY == 1) {
                loadChenges();
            }
            else if (bY-aY == -1) {
                loadChenges();
            } else {
                return desk;
            }
        } if (bY-aY == 2) {
            if (bX-aX == 1) {
                loadChenges();
            }
            else if (bX-aX == -1) {
                loadChenges();
            } else {
                return desk;
            }
        }
        else if (bY-aY == -2) {
            if (bX-aX == 1) {
                loadChenges();
            }
            else if (bX-aX == -1) {
                loadChenges();
            } else {
                return desk;
            }
        }
        return desk;
    }

private static void loadChenges() {
    desk [bX][bY] = " ";
    desk [aX][aY] = "H";
}


}
