package game;

public class Rules {
	public int boardWidth = 8;
	public int boardHeight = 8;
	private final int RULES_DEFAULT = 1;
	public BoardSpace[][] boardPieces;

		
	public Rules(int rulesType) {
		if(rulesType == RULES_DEFAULT) {
			this.boardWidth = 8;
			this.boardHeight = 8;
			boardPieces = new BoardSpace[this.boardWidth][this.boardHeight];
			setStartingPositions(rulesType);			
		}
	}
	
	
	private void setStartingPositions(int rulesType) {
		if(rulesType == RULES_DEFAULT) {
			
			for(int x = 0; x < this.boardWidth; x++) {
				for(int y = 0; y < this.boardHeight; y++) {
					boardPieces[x][y] = new BoardSpace();
				}
			}
			
			boardPieces[0][0].addPiece(new Piece(Piece.PIECE_ROOK, Piece.PLAYER_ONE));
			boardPieces[1][0].addPiece(new Piece(Piece.PIECE_KNIGHT, Piece.PLAYER_ONE));
			boardPieces[2][0].addPiece(new Piece(Piece.PIECE_BISHOP, Piece.PLAYER_ONE));
			boardPieces[3][0].addPiece(new Piece(Piece.PIECE_KING, Piece.PLAYER_ONE));
			boardPieces[4][0].addPiece(new Piece(Piece.PIECE_QUEEN, Piece.PLAYER_ONE));
			boardPieces[5][0].addPiece(new Piece(Piece.PIECE_BISHOP, Piece.PLAYER_ONE));
			boardPieces[6][0].addPiece(new Piece(Piece.PIECE_KNIGHT, Piece.PLAYER_ONE));
			boardPieces[7][0].addPiece(new Piece(Piece.PIECE_ROOK, Piece.PLAYER_ONE));
			
			boardPieces[0][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_ROOK, Piece.PLAYER_TWO));
			boardPieces[1][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_KNIGHT, Piece.PLAYER_TWO));
			boardPieces[2][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_BISHOP, Piece.PLAYER_TWO));
			boardPieces[3][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_KING, Piece.PLAYER_TWO));
			boardPieces[4][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_QUEEN, Piece.PLAYER_TWO));
			boardPieces[5][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_BISHOP, Piece.PLAYER_TWO));
			boardPieces[6][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_KNIGHT, Piece.PLAYER_TWO));
			boardPieces[7][this.boardHeight - 1].addPiece(new Piece(Piece.PIECE_ROOK, Piece.PLAYER_TWO));
			
			for(int x = 0; x < this.boardWidth; x++) {
				boardPieces[x][1].addPiece(new Piece(Piece.PIECE_PAWN, Piece.PLAYER_ONE));
				boardPieces[x][this.boardHeight - 2].addPiece(new Piece(Piece.PIECE_PAWN, Piece.PLAYER_TWO));
			}
			
		}
	}
	
}
