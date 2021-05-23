package main;



public class Case {

    private int colonne;
    private int ligne;
    private Piece piece;

    /*	Constructeur vide	*/
    public Case()
    {
    	
    }
    
    
    /*	Constructeur	*/
    public Case(int ligne, int colonne,Piece p) 
    {
    	this.ligne = ligne;
    	this.colonne = colonne;
    	this.piece = p;
    }
    
    /*	Constructeur par copie	*/
    public Case(Case c)
    {
    	this.colonne = c.getColonne();
    	this.ligne = c.getLigne();
    	this.piece = c.getPiece();
    }

    /*	Retournes si case vide	*/
    public boolean CaseVide() 
    {
    	return (this.piece == null);
    }

    /*	Getters	*/
    public int getLigne() 
    {
    	return this.ligne;
    }

    public int getColonne() 
    {
    	return this.colonne;
    }
    
    /*	Setters	*/
    public void setLigne(int p1) 
    {
    	this.ligne = p1;
    }

    public void setColonne(int p1) 
    {
    	this.colonne = p1;
    }

    public Piece getPiece() 
    {
    	return this.piece;
    }

    public void setPiece(Piece p1) 
    {
    	this.piece = p1;
    }
    
    public String toString()
    {
    if (this.CaseVide())
    {	
    	return piece.toString();
    }
    return "0";
    }
}