package main;

import src.*;

public class TestEchiquier {

	public static void main(String[] args) {
		
		Echiquier ech = new Echiquier();

		(ech.chercherCase(3, 5)).setPiece(new Tour("blanc"));;
		System.out.println(ech.toString());
		ech.deplacerPiece(ech.chercherCase(7, 1), ech.chercherCase(5, 1));
		ech.deplacerPiece(ech.chercherCase(5, 1), ech.chercherCase(3, 1));
		System.out.println(ech.toString());
		ech.deplacerPiece(ech.chercherCase(1, 2), ech.chercherCase(3, 1));
		System.out.println(ech.toString());
	}

}