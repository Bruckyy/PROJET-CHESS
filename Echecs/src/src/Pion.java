package src;

import main.Piece;

public class Pion implements Piece {
	
	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♟";
		}
		else {
			return "♙";
		}
	}

}
