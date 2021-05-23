package src;
import main.*;


public class Tour extends Pieces implements Piece {

	
	public Tour(Case casePiece, String couleur)
	{
		super(couleur, casePiece);
	}
	

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
		return (ca.getLigne() == cd.getLigne() && ca.getColonne() != cd.getColonne()) || (ca.getColonne() == cd.getColonne() && ca.getLigne() != cd.getLigne());
	}
	
	
	public String toString() {
		if(this.getCouleur()=="Noir") {
			return "♜";
		}
		else {
			return "♖";
		}
	}

}
