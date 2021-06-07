package src;
import main.*;


public class Reine extends Pieces implements Piece {


	public Reine(Case casePiece, String couleur)
	{
		super(casePiece, couleur);
	}
	
	public Reine(String couleur)
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
		
		/* Ligne Droite */

		if(ca.getColonne()>cd.getColonne() &&  ca.getLigne()==cd.getLigne()) {
			Case[] ld = new Case[Math.abs(cd.getColonne()-ca.getColonne())];
			for(int i=1;i<Math.abs(cd.getColonne()-ca.getColonne());i++) {
				if(plateau.chercherCase(cd.getLigne(),cd.getColonne()+i).caseVide()==false)return false;

			}
			return true;
		}
		
		/* Ligne Gauche*/

		if(ca.getColonne()<cd.getColonne() && ca.getLigne()==cd.getLigne()) {
			Case[] lg = new Case[Math.abs(ca.getColonne()-cd.getColonne())];
			for(int i=1;i<Math.abs(ca.getColonne()-cd.getColonne());i++) {
				if(plateau.chercherCase(cd.getLigne(),cd.getColonne()-i).caseVide()==false)return false;

			}
			return true;
		}
		
		/*Ligne Haut*/

		if(ca.getLigne()>cd.getLigne() && ca.getColonne()==cd.getLigne()) {
			Case[] lh= new Case[Math.abs(ca.getLigne()-cd.getLigne())];
			for(int i=1;i<Math.abs(ca.getLigne()-cd.getLigne());i++) {
				if(plateau.chercherCase(cd.getLigne()+i,cd.getColonne()).caseVide()==false)return false;

			}
			return true;
		}
		
		/*Ligne Bas */

		if(ca.getLigne()<cd.getLigne() && ca.getColonne()==cd.getColonne()) {
			Case[] lb = new Case[Math.abs(ca.getLigne()-cd.getLigne())];
			for(int i=1;i<Math.abs(ca.getLigne()-cd.getLigne());i++) {
				if(plateau.chercherCase(cd.getLigne()-i,cd.getColonne()).caseVide()==false)return false;

			}
			return true;
		}
		
		/* return par défaut */
		
		return false;
	}
	
	public String toString() {
		if(this.getCouleur()=="noir") {
			return "♛";
		}
		else {
			return "♕";
		}
	}
}
