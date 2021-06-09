package src;

@SuppressWarnings("unused")

public class Main {

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