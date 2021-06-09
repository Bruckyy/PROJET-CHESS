package main;

import src.*;
@SuppressWarnings("unused")

public class main {

	public static void main(String[] args) {
		
      Jeu game = new Jeu();
      game.entrerCoup();

    	  game.setTurn("blanc");
    	  game.affichage();
    	  game.entrerCoup();
    	  while (game.getTurn() == "blanc") {
    	  game.setTurn("blanc");
    	  game.affichage();
    	  game.entrerCoup();
    	  }
	}
}