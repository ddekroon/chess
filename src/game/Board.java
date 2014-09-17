package game;

public class Board {
	public BoardSpace[][] myBoard;
	public Rules gameRules;
	
	public Board(Rules rules) {
		this.gameRules = rules;
		
		myBoard = new BoardSpace[rules.boardWidth][rules.boardHeight];
		for(int x = 0; x < rules.boardWidth; x++) {
			for(int y = 0; y < rules.boardHeight; y++) {
				myBoard[x][y] = new BoardSpace();
				myBoard[x][y].addPiece(rules.boardPieces[x][y].piece);
			
			}
		}
	}
}
