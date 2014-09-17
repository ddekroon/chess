package game;

public class Game {
	public static void main(String[] args) {

		Rules rules = new Rules(1);
	    Board board  = new Board(rules);
	    

		//Create a view : to write student details on console
		GameView view = new GameView(board);
		GameController controller = new GameController(board, view);
		
		controller.updateView();
		
		//update model data
		//controller.setStudentName("John");
		//controller.updateView();
	}

}
