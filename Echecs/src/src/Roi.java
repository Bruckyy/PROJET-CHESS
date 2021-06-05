package src;
import main.*;


public class Roi extends Pieces implements Piece {

	
	public Roi(Case casePiece, String couleur)
	{
		super(casePiece, couleur);
	}
	
	public Roi(String couleur)
	{
		super(couleur);
	}
	
	public String getCouleur() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setCouleur(String newCouleur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Case[] deplacementTab(Case cd, Case ca) {
		return null;
	}
	
	public String toString()
	{
		if(this.getCouleur()=="Noir") {
			return "♛";
		}
		else {
			return "♔";
		}
	}

}
