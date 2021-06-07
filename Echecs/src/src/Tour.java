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
	public String getCouleur() {
		return super.getCouleur();
	}


	@Override
	public void setCouleur(String newCouleur) {
		super.setCouleur(newCouleur);
		
	}

	@Override
	public boolean deplacementPossible(Echiquier plateau, Case cd, Case ca) {
		return cheminLibre(plateau, cd, ca) && !(ca.equals(cd)) && cd.getPiece() != null; 
	}
	
	
	
	public String toString() {
		if(this.getCouleur()=="noir") {
			return "♜";
		}
		else {
			return "♖";
		}
	}

	@Override
	public boolean cheminLibre(Echiquier plateau, Case cd, Case ca) 
	{
		/* Déplacement de haut en bas
		 * 
		 */
		if (ca.getLigne() == cd.getLigne())
		{
			int j = Math.abs(cd.getColonne() - ca.getColonne());
			
			if (ca.getColonne() < cd.getColonne())
			{
				
				for (int i = 0; i < j; i ++)
				{
					if (plateau.chercherCase(cd.getLigne(), cd.getLigne() - (i + 1)).getPiece() != null)
					{
						return false;
					}
				}
			}
			
			if (ca.getColonne() > cd.getColonne())
			{
				
				for (int i = 0; i < j; i ++)
				{
					if (plateau.chercherCase(cd.getLigne(), cd.getLigne() - (i - 1)).getPiece() != null)
					{
						return false;
					}
				}
			}
		}
		
		/* Déplacement de droite à gauche et inversement
		 * 
		 */
		if (ca.getColonne() == cd.getColonne())
		{
			int j = Math.abs(ca.getLigne() - cd.getLigne());
			
			if (ca.getLigne() < cd.getLigne())
			{
				
				for (int i = 0; i < j; i ++)
				{
					if (plateau.chercherCase(cd.getColonne(), cd.getColonne() - (i + 1)).getPiece() != null)
					{
						return false;
					}
				}
			}
		
			
			if (ca.getLigne() > cd.getLigne())
			{
				for (int i = 0; i < j; i ++)
				{
					if (plateau.chercherCase(cd.getLigne(), cd.getLigne() - (i - 1)).getPiece() != null)
					{
						return false;
					}
				}
			}
		}
		return true;
	}


}
