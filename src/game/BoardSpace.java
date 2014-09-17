package game;

public class BoardSpace {
	public Piece piece;
	public char xCord = 'z';
	public int yCord = -1;
	
	public BoardSpace() {
		piece = null;
	}
	
	public BoardSpace(Piece piece) {
		this.piece = piece;
	}
	
	public void addPiece(Piece piece) {
		if(piece != null) {
			this.piece = piece;
		} else {
			this.piece = new Piece();
		}
	}
	
	public Piece getPiece() {
		return this.piece;
	}
}
