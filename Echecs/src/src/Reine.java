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
	public Case[] deplacementTab(Case cd, Case ca) {
		
		if (ca.equals(cd)) return null;
		int z=0;
		
		/* Diagonale Haute Droite*/
		if(ca.getLigne()>cd.getLigne() && ca.getColonne()>cd.getColonne()) {
		Case[] dhd = new Case[Math.abs(cd.getLigne()-ca.getLigne())];
		for(int i=1;i<Math.abs(cd.getLigne())-ca.getLigne();i++) {
				dhd[z] = new Case(i+cd.getLigne(),i+cd.getColonne(),null);
				z++;
		}
		return dhd;
		}
		
		/* Diagonale Haut Gauche */
		z=0;
		if(ca.getLigne()<cd.getLigne() && ca.getColonne()<cd.getColonne()) {
		Case[] dhg = new Case[Math.abs(cd.getLigne()-ca.getLigne())];
		for(int i=1;i<Math.abs(cd.getLigne()-ca.getLigne());i++) {
				dhg[z] = new Case(cd.getLigne()-i,cd.getColonne()+i,null);
				z++;
		}
		return dhg;
		}

		/* Diagonale Bas Droite */
		z=0;
		if(ca.getColonne() > cd.getColonne() && ca.getLigne() < cd.getLigne()){
		Case[] dbd = new Case[Math.abs(cd.getLigne()-ca.getLigne())];
		for(int i=1;i<Math.abs(cd.getLigne()-ca.getLigne());i++) {
			dbd[z] = new Case(cd.getLigne()+i,cd.getColonne()-i,null);
			z++;
	        }
		return dbd;
		}
		
		/* Diagonale Bas Gauche */
		z=0;
		if(ca.getColonne() < cd.getColonne() && ca.getLigne() > cd.getLigne()){
		Case[] dbg = new Case[Math.abs(cd.getLigne()-ca.getLigne())];
		for(int i=1; i<Math.abs(cd.getLigne()-ca.getLigne());i++){
			dbg[z]= new Case(cd.getLigne()-i,cd.getColonne()-i,null);
			z++;
		}
		return dbg;
		}
		
		/* Ligne Droite */
		z=0;
		if(ca.getColonne()>cd.getColonne() &&  ca.getLigne()==cd.getLigne()) {
			Case[] ld = new Case[Math.abs(cd.getColonne()-ca.getColonne())];
			for(int i=1;i<Math.abs(cd.getColonne()-ca.getColonne());i++) {
				ld[z]= new Case(cd.getLigne(),cd.getColonne()+i,null);
				z++;
			}
			return ld;
		}
		
		/* Ligne Gauche*/
		z=0;
		if(ca.getColonne()<cd.getColonne() && ca.getLigne()==cd.getLigne()) {
			Case[] lg = new Case[Math.abs(ca.getColonne()-cd.getColonne())];
			for(int i=1;i<Math.abs(ca.getColonne()-cd.getColonne());i++) {
				lg[z]= new Case(cd.getLigne(),cd.getColonne()-i,null);
				z++;
			}
			return lg;
		}
		
		/*Ligne Haut*/
		z=0;
		if(ca.getLigne()>cd.getLigne() && ca.getColonne()==cd.getLigne()) {
			Case[] lh= new Case[Math.abs(ca.getLigne()-cd.getLigne())];
			for(int i=1;i<Math.abs(ca.getLigne()-cd.getLigne());i++) {
				lh[z] = new Case(cd.getLigne()+i,cd.getColonne(),null);
				z++;
			}
			return lh;
		}
		
		/*Ligne Bas */
		z=0;
		if(ca.getLigne()<cd.getLigne() && ca.getColonne()==cd.getColonne()) {
			Case[] lb = new Case[Math.abs(ca.getLigne()-cd.getLigne())];
			for(int i=1;i<Math.abs(ca.getLigne()-cd.getLigne());i++) {
				lb[z]= new Case(cd.getLigne()-i,cd.getColonne(),null);
				z++;
			}
			return lb;
		}
		
		return null;
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
