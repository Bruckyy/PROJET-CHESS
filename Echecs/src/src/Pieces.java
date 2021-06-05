package src;
import main.*;


public abstract class Pieces implements Piece{
	
	private String couleur;

	
	public Pieces()
	{}
	
	public Pieces(Case casePiece, String couleur)
	{
		this.couleur = couleur;
	}
	
	public Pieces(String couleur)
	{
		this.couleur = couleur;
	}
	
	public Pieces(Piece p)
	{
		this.couleur = p.getCouleur();

	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	

	@Override
	public void setCouleur(String newCouleur)
	{
		this.couleur = newCouleur;
	}
		
	public boolean equals(Object o)
	{
		if(o==null) return false;
		if(!(o.getClass()!=this.getClass())) return false;
		
		return (this.getCouleur() == ((Piece)o).getCouleur());
	}
	@Override
	public Case[] deplacementTab(Case cd, Case ca)
	{
		return null;
	};
	
}
