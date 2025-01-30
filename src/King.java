public class King {

    public void king() {

    }


    private static void gameOver() {
        System. exit(0);
    }
    private static String [][] move (String [][] desk, int bX, int bY, int aX, int aY) {

    if (desk[aX][aY].equals("K")){
        return desk;
    }
    if (aX<2   || aX > 11  || aY< 2 || aY > 11 )  {
        return desk;
    }
    if (bX == bX && aY == aY)
        return desk;

    if ((  1 >=  bX-aX) && (bX-aX >= - 1) && (aY-aY <= 1 )&& ( aY-aY >=-1) ){
        desk[aX][aY] = "K";
        desk[bX][bY] = " ";
        return desk;
    }

    return desk ;
    }






}
