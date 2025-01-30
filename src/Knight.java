public class Knight {


    private static String[][] Knight (String [][] desk, int bX, int bY, int aX, int aY) {

        if (bX == bX && aY == aY)
            return desk;
        if (aX<2   || aX > 11  || aY< 2 || aY > 11 )  {
            return desk;
        }


        if ((bX-aX==2) && (bY-aY==1)){

            desk [bX][bY] = " ";
            desk [aX][aY] = "H";
        } else if ((bX-aX==-1) && (bY-aY==1)){
            if (aX > 2 &&  aY > 2)  {} // нужна проверка на то возможен ли ход
            desk [bX][bY] = " ";
            desk [aX][aY] = "H";
        }else if ((bX-aX==-1) && (bY-aY==-2)){
            if (aX > 2 &&  aY > 2)  {} // нужна проверка на то возможен ли ход
            desk [bX][bY] = " ";
            desk [aX][aY] = "H";
        }else if ((bX-aX==+1) && (bY-aY==-2)){
            if (aX > 2 &&  aY > 2)  {} // нужна проверка на то возможен ли ход
            desk [bX][bY] = " ";
            desk [aX][aY] = "H";
        }


        return desk;



    }




}
