package main;

import src.*;

public class TestEchiquier {

	public static void main(String[] args) {
		Echiquier ech = new Echiquier();
		
		System.out.println(ech.toString());
		ech.deplacerPiece(ech.chercherCase(7, 1), ech.chercherCase(5, 1));
		System.out.println(ech.toString());
	}

}