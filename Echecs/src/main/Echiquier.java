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
    
    /* 	Vérifies si le chemin de la pièce est libre
     *  pour des mouvement linéaires
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
    
    
    }

    public String toString() {
		return null;
    }

}
