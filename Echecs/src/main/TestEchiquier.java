package main;

import src.*;

public class TestEchiquier {

	public static void main(String[] args) {
		Echiquier ech = new Echiquier();
		System.out.println(ech.toString());
		ech.chercherCase(5, 4).setPiece(new Pion("blanc"));
		ech.chercherCase(4, 4).setPiece(new Tour("noir"));
		System.out.println(ech.toString());
		ech.deplacerPiece(ech.chercherCase(4, 4), ech.chercherCase(5, 4));
		System.out.println(ech.toString());
		
		
	}

}