package main;

import src.*;
@SuppressWarnings("unused")

public class main {

	public static void main(String[] args) {
		
      Jeu game = new Jeu();
      game.entrerCoup();
      while (!game.getEchiquier().mat("noir") || !game.getEchiquier().mat("blanc"))
      {
    	  game.setTurn("noir");
    	  game.affichage();
    	  game.entrerCoup();
    	  game.setTurn("blanc");
    	  game.affichage();
    	  game.entrerCoup();
    	  game.affichage();
      }
	}
}