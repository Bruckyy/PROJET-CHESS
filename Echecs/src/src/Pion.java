package src;
import main.Case;
import main.Piece;

public class Pion extends Pieces implements Piece {
	
	private boolean aBouge = false;
	
	public Pion()
	{}
	
	public Pion(String couleur)
	{
		super(couleur);
	}

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
		
		/* Si le pion a déjà bougé, mouvements de 1 seulement
		 */
		if (aBouge && this.getCouleur() == "blanc") 
		{	
			Case[] c = new Case[1];
			/*Si le pion avance de 1 case en avant
			 */
			if (ca.getColonne() == cd.getColonne() && cd.getLigne() + 1 == ca.getLigne())
			{			
				c[0] = new Case(ca.getLigne(), ca.getColonne(), null);
				return c;
			}
		}
		
		
		/* Si le pion n'a pas bougé, il peut avancer de 2
		* cases
		*/
		if (ca.getColonne() == cd.getColonne() && ca.getLigne() == cd.getLigne() + 2)
		{
				Case[] c = new Case[2];
				c[0] = new Case(cd.getLigne() + 1, cd.getColonne(), null);
				c[1] = new Case(cd.getLigne() + 2, cd.getColonne(), null);
				return c;
		}
		
		
		/* Si le pion avance en mangeant
		 */
		if ((ca.getColonne() == cd.getColonne() - 1 || ca.getColonne() == cd.getColonne() + 1) && cd.getLigne() + 1 == ca.getLigne())
		{	
			Case[] c = new Case[1];
			c[0] = new Case(ca.getLigne(), ca.getColonne(), null);
			return c;
		}	
		
		/* Si le pion a déjà bougé, mouvements de 1 seulement
		 */
		if (aBouge && this.getCouleur() == "noir") 
		{	
			Case[] c = new Case[1];
			/*Si le pion avance de 1 case en avant
			 */
			if (ca.getColonne() == cd.getColonne() && cd.getLigne() - 1 == ca.getLigne())
			{			
				c[0] = new Case(ca.getLigne(), ca.getColonne(), null);
				return c;
			}
		}
		
		
		/* Si le pion n'a pas bougé, il peut avancer de 2
		* cases
		*/
		if (ca.getColonne() == cd.getColonne() && ca.getLigne() == cd.getLigne() - 2)
		{
				Case[] c = new Case[2];
				c[0] = new Case(cd.getLigne() - 1, cd.getColonne(), null);
				c[1] = new Case(cd.getLigne() - 2, cd.getColonne(), null);
				return c;
		}
		
		
		/* Si le pion avance en mangeant
		 */
		if ((ca.getColonne() == cd.getColonne() - 1 || ca.getColonne() == cd.getColonne() + 1) && cd.getLigne() - 1 == ca.getLigne())
		{	
			Case[] c = new Case[1];
			c[0] = new Case(ca.getLigne(), ca.getColonne(), null);
			return c;
		}	
		return null;
	}
	
	public void setAbouge(boolean statue)
	{
		this.aBouge = statue;
	}
	
	public String toString() {
		if(this.getCouleur()=="noir") {
			return "♟";
		}
		else {
			return "♙";
		}
	}

}
