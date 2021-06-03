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
	
	@Override
	public Case getCase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCouleur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCase(Case newCase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCouleur(String newCouleur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Case[] deplacementTab(Case cd, Case ca) {
		// TODO Auto-generated method stub
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
