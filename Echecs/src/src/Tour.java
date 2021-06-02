package src;
import main.*;


public class Tour extends Pieces implements Piece {

	
	public Tour(Case casePiece, String couleur)
	{
		super(casePiece, couleur);
	}
	
	public Tour(String couleur)
	{
		super(couleur);
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
	public Case[] deplacementTab(Case cd, Case ca) {
		
		if (ca.equals(cd)) return null;
		
		/* La tour se deplace en ligne (haut en bas, bas en haut) */
		if ((ca.getLigne() == cd.getLigne()) && (ca.getColonne() != cd.getColonne()))
		{
			Case[] c = new Case[Math.abs(ca.getColonne() - cd.getColonne())];
			/* La tour monte */
			if (ca.getLigne() - cd.getLigne() < 0)
			{
				for (int i = 0; i < cd.getLigne() - ca.getLigne(); i++)
				{
					c[i] = new Case(cd.getLigne() + i + 1, cd.getColonne(), null);
				}
			}
			
			/* La tour descend */
			else
			{
				for (int i = 0; i < cd.getLigne() - ca.getLigne(); i ++)
				{
					c[i] = new Case(cd.getLigne() - (i + 1), cd.getColonne(), null);
				}
			}
			return c;
		}
		
		/* La tour se déplace en colonne ( de droite à gauche, de gauche à droite ) */
		if ((ca.getColonne() == cd.getColonne()) && (ca.getLigne() != cd.getLigne()))
		{
			Case[] c = new Case[Math.abs(ca.getLigne() - cd.getLigne())];
			/* La tour se déplace à gauche */
			if (ca.getColonne() - cd.getColonne() < 0)
			{
				for (int i = 0; i < cd.getColonne() - ca.getColonne(); i ++)
				{
					c[i] = new Case(cd.getLigne(), cd.getColonne() - (i + 1), null);
				}
			}
			else
			{
				for (int i = 0; i < cd.getColonne() - ca.getColonne(); i ++)
				{
					c[i] = new Case(cd.getLigne(), cd.getColonne() + i + 1, null);
				}
			}
			return c;
		}
		/* Selon le type de déplacement on retourne un tableau du chemin de la pièce non inclus
		 * sa case de départ
		 */
		return null;
		
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
