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
    public Case chercherRoi(String nomPiece, String couleur)
    {
    	ListIterator<Case> i = this.board.listIterator();
    	while (i.hasNext()) {
    		Case c = i.next();
    		if (c.getPiece().getNom() == nomPiece && c.getPiece().getCouleur() == couleur)
    			return c;
    			}
    	return null; 
    }
    
    public ArrayList<Case> chercherPieces(String couleur)
    {
    	ArrayList<Case> pieces = new ArrayList<>();
    	ListIterator<Case> i = this.board.listIterator();
    	while (i.hasNext()) {
    		Case c = i.next();
    		if (!(c.caseVide())) 
    		{
    			if (c.getPiece().getCouleur() == couleur)
    			{
    				pieces.add(c);
    			}
    		}
    			
    			}
    	return pieces;
    }
    
    public boolean mat(String couleur)
    {
    	Case caseRoi = this.chercherRoi("roi", couleur);
    	ArrayList<Case> pieces = this.chercherPieces(couleur);
    	
    	for (int i = 0 ; i < pieces.size(); i ++)
    	{
    		if (pieces.get(i).getPiece().deplacementPossible(this, this.chercherCase(pieces.get(i).getLigne(), pieces.get(i).getColonne()), caseRoi))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    
    public ArrayList<Case >getBoard()
    {
    	return this.board;
    }
    
    
    public void deplacerPiece(Case casePiece, Case ca)
    {
    	if (casePiece.getPiece().deplacementPossible(this, casePiece, ca) && casePiece.getPiece() != null) 
    	{
    		ca.setPiece(casePiece.getPiece());
    		casePiece.setPiece(null);
    	}
    	
    	else
    	{
    		System.out.println("Dépalcement impossible !");
    	}
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
    
    
    this.chercherCase(1, 1).setPiece(new Tour("blanc", "tour"));
    this.chercherCase(1, 2).setPiece(new Cavalier("blanc", "cavalier"));
    this.chercherCase(1, 3).setPiece(new Fou("blanc", "fou"));
    this.chercherCase(1, 4).setPiece(new Reine("blanc", "reine"));
    this.chercherCase(1, 5).setPiece(new Roi("blanc", "roi"));
    this.chercherCase(1, 6).setPiece(new Fou("blanc", "fou"));
    this.chercherCase(1, 7).setPiece(new Cavalier("blanc", "cavalier"));
    this.chercherCase(1, 8).setPiece(new Tour("blanc", "tour"));
    
    this.chercherCase(2, 1).setPiece(new Pion("blanc", "pion"));
    this.chercherCase(2, 2).setPiece(new Pion("blanc", "pion"));
    this.chercherCase(2, 3).setPiece(new Pion("blanc", "pion"));
    this.chercherCase(2, 4).setPiece(new Pion("blanc", "pion"));
    this.chercherCase(2, 5).setPiece(new Pion("blanc", "pion"));
    this.chercherCase(2, 6).setPiece(new Pion("blanc", "pion"));
    this.chercherCase(2, 7).setPiece(new Pion("blanc", "pion"));
    this.chercherCase(2, 8).setPiece(new Pion("blanc", "pion"));
    
    this.chercherCase(8, 1).setPiece(new Tour("noir", "tour"));
    this.chercherCase(8, 2).setPiece(new Cavalier("noir", "cavalier"));
    this.chercherCase(8, 3).setPiece(new Fou("noir", "fou"));
    this.chercherCase(8, 4).setPiece(new Roi("noir", "roi"));
    this.chercherCase(8, 5).setPiece(new Reine("noir", "reine"));
    this.chercherCase(8, 6).setPiece(new Fou("noir", "fou"));
    this.chercherCase(8, 7).setPiece(new Cavalier("noir", "cavalier"));
    this.chercherCase(8, 8).setPiece(new Tour("noir", "tour"));
    
    this.chercherCase(7, 1).setPiece(new Pion("noir", "pion"));
    this.chercherCase(7, 2).setPiece(new Pion("noir", "pion"));
    this.chercherCase(7, 3).setPiece(new Pion("noir", "pion"));
    this.chercherCase(7, 4).setPiece(new Pion("noir", "pion"));
    this.chercherCase(7, 5).setPiece(new Pion("noir", "pion"));
    this.chercherCase(7, 6).setPiece(new Pion("noir", "pion"));
    this.chercherCase(7, 7).setPiece(new Pion("noir", "pion"));
    this.chercherCase(7, 8).setPiece(new Pion("noir", "pion"));
    }
 
    
    
    public String toString() {
    	String s = "    A	   B	  C	   D	   E	   F	   G	  H\n";
    	int j = 1;
		for (int i = 0; i < this.board.size(); i ++)
		{
			s += "|  " + this.board.get(i) + "	";
			if ((i + 1)%8 == 0 && i != 0)
			{
				s += "|	|" + Integer.toString(j) + "\n";
				s += "▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬\n";
				j ++;
			}
		}
		s +="    A	   B	  C	   D	   E	   F	   G	  H\n";
		
		return s;
    }

}
