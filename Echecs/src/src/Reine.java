package src;

import main.Piece;

public class Reine implements Piece {

	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♛";
		}
		else {
			return "♕";
		}
	}
}
