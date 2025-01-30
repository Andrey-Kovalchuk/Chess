public class GameBoard {

    private int [][] gameBoard;

    public void gameBoard()
    {
        gameBoard = new int[12][12];
    }

    public int[][] getGameBoard()
    {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard)
    {
            try
            {
                this.gameBoard = gameBoard;
            }
            catch(Exception e)
            {
                System.out.println("Incorrect input");
            }
    }
}
