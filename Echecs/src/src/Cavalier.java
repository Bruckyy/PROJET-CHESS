package src;
import main.Piece;

public class Cavalier implements Piece {

	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♞";
		}
		else {
			return "♘";
		}
	}
}
