package main;
import java.util.*;


public class Echiquier {
	
    private ArrayList<Case> board = new ArrayList<>();
    
    /*	retourne la case avec sa ligne et colonne correspondante */
    public Case ChercherCase(int ligne, int colonne)
    {
    	  ListIterator<Case> i = this.board.listIterator();
          while (i.hasNext()) {
              Case c = i.next();
              if (c.getLigne() == ligne && c.getColonne() == colonne)
                  return c;
          }
		return null; 
    }
    
    /*	retourne la case de la piece avec son nom et sa couleur */
    public Case ChercherPiece(Piece nomPiece, String couleur)
    {
  	  ListIterator<Case> i = this.board.listIterator();
      while (i.hasNext()) {
          Case c = i.next();
          if (c.getPiece() == nomPiece && c.getPiece().getCouleur() == couleur)
              return c;
      }
	return null; 
    }

    public String toString() {
		return null;
    }

}
