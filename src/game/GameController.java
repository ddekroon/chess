package game;

public class GameController {
	public Board board;
	public GameView gameView;
	
	
	public GameController(Board board, GameView view) {
		this.board = board;
		this.gameView = view;
	}
	
	public void updateView() {
		this.gameView.displayBoard();
	}
	
}
