//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.createNewGameBoard();
        gameBoard.drawGameBoard();
        MoveOfPiece moveOfPiece = new MoveOfPiece();
        moveOfPiece.playInChess();
    }
}