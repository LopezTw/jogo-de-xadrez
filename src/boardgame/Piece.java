package boardgame;

public class Piece {
	
	protected Position position;   // É uma posição simples de Matriz e nao do tabuleiro, portando colocamos protected pra nao ser visivel na camada do tabuleiro de xadrez.
	private Board board;
	
	public Piece(Board board) {
		
		this.board = board;
		position = null; // Poderia nao colocar nada, daria o msm resultado.
		
	}

	protected Board getBoard() { // Protegido para ser acessado apenas por classes do mesmo pacote e subclasses
		return board;
	}

								// Método SETboard removido pois nao queremos que o tabuleiro seja alterado.
	
	
	
	
	
	
}
