package src;
import main.Case;
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
	public Case[] deplacementTab(Case cd, Case ca) {
		// TODO Auto-generated method stub
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
		z=0;
		/* Diagonale Haut Gauche */
		if(ca.getLigne()<cd.getLigne() && ca.getColonne()<cd.getColonne()) {
		Case[] dhg = new Case[Math.abs(cd.getLigne()-ca.getLigne())];
		for(int i=1;i<Math.abs(cd.getLigne()-ca.getLigne());i++) {
				dhg[z] = new Case(cd.getLigne()-i,cd.getColonne()+i,null);
				z++;
		}
		return dhg;
		}
		z=0;
		/* Diagonale Bas Droite */
		if(ca.getColonne() > cd.getColonne() && ca.getLigne() < cd.getLigne()){
		Case[] dbd = new Case[Math.abs(cd.getLigne()-ca.getLigne())];
		for(int i=1;i<Math.abs(cd.getLigne()-ca.getLigne());i++) {
			dbd[z] = new Case(cd.getLigne()+i,cd.getColonne()-i,null);
			z++;
	        }
		return dbd;
		}
		z=0;
		/* Diagonale Bas Gauche */
		if(ca.getColonne() < cd.getColonne() && ca.getLigne() > cd.getLigne()){
		Case[] dbg = new Case[Math.abs(cd.getLigne()-ca.getLigne())];
		for(int i=1; i<Math.abs(cd.getLigne()-ca.getLigne());i++){
			dbg[z]= new Case(cd.getLigne()-i,cd.getColonne()-i,null);
			z++;
		}
		return dbg;
		}
		return null;
		
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
