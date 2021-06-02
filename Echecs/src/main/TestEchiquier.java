package main;

import src.*;

public class TestEchiquier {

	public static void main(String[] args) {
		Echiquier ech = new Echiquier();
		ech.getBoard().get(0).setPiece(new Tour("blanc"));
		System.out.println(ech.cheminLibre(ech.getBoard().get(0).getPiece().deplacementTab(ech.chercherCase(1, 1), ech.chercherCase(8, 1))));

	}

}
