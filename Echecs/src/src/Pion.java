package src;
import main.Case;
import main.Piece;

public class Pion extends Pieces implements Piece {
	
	

	@Override
	public Case getCase() {
		// TODO Auto-generated method stub
		return super.getCase();
	}

	@Override
	public String getCouleur() {
		// TODO Auto-generated method stub
		return super.getCouleur();
	}

	@Override
	public void setCase(Case newCase) {
		// TODO Auto-generated method stub
		super.setCase(newCase);
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
	
	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♟";
		}
		else {
			return "♙";
		}
	}

}
