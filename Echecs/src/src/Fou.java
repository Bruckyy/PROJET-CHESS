package src;

import main.Piece;

public class Fou implements Piece {

	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♝";
		}
		else {
			return "♗";
		}
	}
}
