package game;

public class GameView {
	public Board gameBoard;
	
	public GameView(Board gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	public void displayBoard() {
		
		for(int y = 0; y < gameBoard.gameRules.boardHeight; y++) {
			for(int x = 0; x < gameBoard.gameRules.boardWidth; x++) {
				System.out.print(gameBoard.myBoard[x][y].piece.toString() + " ");
			}
			System.out.print("\n");
		}
	}
}
