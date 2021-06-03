package main;
import src.*;


import java.util.*;


public class Echiquier {
	
    private ArrayList<Case> board = new ArrayList<>();
    
    /*	retourne la case avec sa ligne et colonne correspondante */
    
    public Echiquier()
    {
    	this.init();
    }
    public Case chercherCase(int ligne, int colonne)
    {
    	ListIterator<Case> i = this.board.listIterator();
    		while (i.hasNext()) {
    			Case c = i.next();
    			if (c.getLigne() == ligne && c.getColonne() == colonne)
    				return c;
    			}
		return null; 
    }
    
    /*	retourne la case de la piece 
     *	avec son nom et sa couleur 
     */
    public Case chercherPiece(Piece nomPiece, String couleur)
    {
    	ListIterator<Case> i = this.board.listIterator();
    	while (i.hasNext()) {
    		Case c = i.next();
    		if (c.getPiece() == nomPiece && c.getPiece().getCouleur() == couleur)
    			return c;
    			}
    	return null; 
    }
    
    /* 	V�rifies si le chemin de la pi�ce est libre
     *  pour des mouvement lin�aires
     */
    public boolean cheminLibre(Case[] deplacementTab)
    {
    	int i = 0;
    	while (i < deplacementTab.length - 1)
    	{
    		if ((this.chercherCase(deplacementTab[i].getLigne(), deplacementTab[i].getColonne())).caseVide())
    		{
    			i ++;
    		}
    	}
    	return i == deplacementTab.length - 1;
    }
    
    public ArrayList<Case >getBoard()
    {
    	return this.board;
    }
    
    public void init()
    {
    	
    int j = 0;
	int l = 1;
    while (j < 8)
    {
    	int i = 0;
    	int c = 1;
    	while (i < 8)
    	{
    		this.board.add(new Case(l, c, null));
    		i ++;
    		c ++;
    	}
    	l ++;
    	j ++;
    }
    
    
    this.chercherCase(1, 1).setPiece(new Tour("blanc"));
    this.chercherCase(1, 2).setPiece(new Cavalier("blanc"));
    this.chercherCase(1, 3).setPiece(new Fou("blanc"));
    this.chercherCase(1, 4).setPiece(new Reine("blanc"));
    this.chercherCase(1, 5).setPiece(new Roi("blanc"));
    this.chercherCase(1, 6).setPiece(new Fou("blanc"));
    this.chercherCase(1, 7).setPiece(new Cavalier("blanc"));
    this.chercherCase(1, 8).setPiece(new Tour("blanc"));
    
    this.chercherCase(2, 1).setPiece(new Pion("blanc"));
    this.chercherCase(2, 2).setPiece(new Pion("blanc"));
    this.chercherCase(2, 3).setPiece(new Pion("blanc"));
    this.chercherCase(2, 4).setPiece(new Pion("blanc"));
    this.chercherCase(2, 5).setPiece(new Pion("blanc"));
    this.chercherCase(2, 6).setPiece(new Pion("blanc"));
    this.chercherCase(2, 7).setPiece(new Pion("blanc"));
    this.chercherCase(2, 8).setPiece(new Pion("blanc"));
    
    this.chercherCase(8, 1).setPiece(new Tour("noir"));
    this.chercherCase(8, 2).setPiece(new Cavalier("noir"));
    this.chercherCase(8, 3).setPiece(new Fou("noir"));
    this.chercherCase(8, 4).setPiece(new Roi("noir"));
    this.chercherCase(8, 5).setPiece(new Reine("noir"));
    this.chercherCase(8, 6).setPiece(new Fou("noir"));
    this.chercherCase(8, 7).setPiece(new Cavalier("noir"));
    this.chercherCase(8, 8).setPiece(new Tour("noir"));
    
    this.chercherCase(7, 1).setPiece(new Pion("noir"));
    this.chercherCase(7, 2).setPiece(new Pion("noir"));
    this.chercherCase(7, 3).setPiece(new Pion("noir"));
    this.chercherCase(7, 4).setPiece(new Pion("noir"));
    this.chercherCase(7, 5).setPiece(new Pion("noir"));
    this.chercherCase(7, 6).setPiece(new Pion("noir"));
    this.chercherCase(7, 7).setPiece(new Pion("noir"));
    this.chercherCase(7, 8).setPiece(new Pion("noir"));
    }

    public String toString() {
    	String s = "";
		for (int i = 0; i < this.board.size(); i ++)
		{
			s += this.board.get(i) + " ; ";
		}
		
		return s;
    }

}