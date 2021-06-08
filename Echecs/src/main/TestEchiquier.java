package main;

import src.*;

public class TestEchiquier {

	public static void main(String[] args) {
		
		Echiquier ech = new Echiquier();

		(ech.chercherCase(3, 5)).setPiece(new Roi("blanc", "roi"));
		ech.chercherCase(4, 6).setPiece(new Pion("noir", "pion"));
		ech.toString();
		if (ech.mat("blanc"))
		{
			System.out.println("échec !");
		}
		System.out.println(ech.toString());
		
	}

}