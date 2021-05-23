package src;
import main.Case;
import main.Piece;

public class Fou extends Pieces implements Piece {
	

	@Override
	public Case getCase() {

		return super.getCase();
	}

	@Override
	public String getCouleur() {

		return super.getCouleur();
	}

	@Override
	public void setCase(Case newCase) {
		super.setCase(newCase);
		
	}

	@Override
	public void setCouleur(String newCouleur) {
		super.setCouleur(newCouleur);
	}

	@Override
	public boolean verifDeplacement(Case cd, Case ca) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♝";
		}
		else {
			return "♗";
		}
	}
}
