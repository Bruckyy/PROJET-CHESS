package src;
import main.Case;
import main.Echiquier;
import main.Piece;

public class Fou extends Pieces implements Piece {
	
	public Fou(Case casePiece, String couleur)
	{
		super(casePiece, couleur);
	}
	
	public Fou(String couleur)
	{
		super(couleur);
	}

	@Override
	public String getCouleur() {

		return super.getCouleur();
	}


	@Override
	public void setCouleur(String newCouleur) {
		super.setCouleur(newCouleur);
	}

	@Override
	public boolean cheminLibre(Echiquier plateau, Case cd, Case ca)  {
		// TODO Auto-generated method stub
		if (ca.equals(cd)) return false;

		/* Diagonale Haute Droite*/
		if(ca.getLigne()>cd.getLigne() && ca.getColonne()>cd.getColonne()) {
			if((Math.abs(ca.getColonne()-cd.getColonne())-(Math.abs(ca.getLigne()-cd.getLigne()))!=0))return false;
				
		for(int i=1;i<Math.abs(cd.getLigne())-ca.getLigne();i++) {
				if(plateau.chercherCase(i+cd.getLigne(),i+cd.getColonne()).caseVide()==false) return false;
				
				
		}
		return true;
		}

		/* Diagonale Haut Gauche */
		if(ca.getLigne()<cd.getLigne() && ca.getColonne()<cd.getColonne()) {
			if((Math.abs(ca.getColonne()-cd.getColonne())-(Math.abs(ca.getLigne()-cd.getLigne()))!=0))return false;

		for(int i=1;i<Math.abs(cd.getLigne()-ca.getLigne());i++) {
				if(plateau.chercherCase(cd.getLigne()-i,cd.getColonne()+i).caseVide()==false) return false;

		}
		return true;
		}

		/* Diagonale Bas Droite */
		if(ca.getColonne() > cd.getColonne() && ca.getLigne() < cd.getLigne()){
			if((Math.abs(ca.getColonne()-cd.getColonne())-(Math.abs(ca.getLigne()-cd.getLigne()))!=0))return false;

		for(int i=1;i<Math.abs(cd.getLigne()-ca.getLigne());i++) {
			if(plateau.chercherCase(cd.getLigne()+i,cd.getColonne()-i).caseVide()==false) return false;

	        }
		return true;
		}

		/* Diagonale Bas Gauche */
		if(ca.getColonne() < cd.getColonne() && ca.getLigne() > cd.getLigne()){
			if((Math.abs(ca.getColonne()-cd.getColonne())-(Math.abs(ca.getLigne()-cd.getLigne()))!=0))return false;

		for(int i=1; i<Math.abs(cd.getLigne()-ca.getLigne());i++){
			if(plateau.chercherCase(cd.getLigne()-i,cd.getColonne()-i).caseVide()==false)return false;

		}
		return true;
		}
		return false;
		
	}
	
	public String toString() {
		if(this.getCouleur()=="noir") {
			return "♝";
		}
		else {
			return "♗";
		}
	}
}
