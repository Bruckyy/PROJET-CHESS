package src;
import main.*;


public abstract class Pieces implements Piece{
	
	private String couleur;
	private Case casePiece;
	
	public Pieces()
	{}
	
	public Pieces(String couleur, Case casePiece)
	{
		this.couleur = couleur;
		this.casePiece = casePiece;
	}
	
	public Pieces(Pieces p)
	{
		this.couleur = p.getCouleur();
		this.casePiece = p.getCase();
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	
	public Case getCase()
	{
		return this.casePiece;
	}
	

	@Override
	public void setCase(Case newCase)
	{
		this.casePiece = newCase;
	}

	@Override
	public void setCouleur(String newCouleur)
	{
		this.couleur = newCouleur;
	}
		
	public boolean equals(Object o)
	{
		return (this.getCouleur() == ((Piece)o).getCouleur());
	}
	@Override
	public  abstract Case[] deplacementTab(Case cd, Case ca);
	
}
