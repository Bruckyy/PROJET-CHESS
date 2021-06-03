package main;

import src.*;

public class TestEchiquier {

	public static void main(String[] args) {
		Echiquier ech = new Echiquier();
		Pieces piece = (Pieces) ech.chercherCase(1, 1).getPiece();
		System.out.println(ech.cheminLibre(ech.chercherCase(1, 1).getPiece().deplacementTab(ech.chercherCase(1, 1),
				ech.chercherCase(2, 1))));
		ech.chercherCase(1, 2);
		System.out.println(ech.toString());
	}

}
