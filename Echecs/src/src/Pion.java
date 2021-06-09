package src;
import main.Case;
import main.Echiquier;
import main.Piece;

public class Pion extends Pieces implements Piece {
	
	private boolean aBouge = false;
	
	public Pion()
	{}
	
	public Pion(String couleur, String nom)
	{
		super(couleur, nom);
	}
	
	public String getCouleur() {
		return super.getCouleur();
	}
	
	public String getNom()
	{
		return super.getNom();
	}




	@Override
	public void setCouleur(String newCouleur) {
		// TODO Auto-generated method stub
		
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

	@Override
	public boolean cheminLibre(Echiquier plateau, Case cd, Case ca) {
		if (this.getCouleur() == "blanc")
		{
			if (ca.getLigne() == cd.getLigne() + 2)
			{
				if(!aBouge)	
				{
					if (plateau.chercherCase(cd.getLigne() + 1, cd.getColonne()).caseVide() && plateau.chercherCase(cd.getLigne() + 2, cd.getColonne()).caseVide())
					{
						this.aBouge = true;
						return true;
					}
				}
				else
				{
					return false;
				}
			}
			
			if (ca.getLigne() == cd.getLigne() + 1)
			{
				if (plateau.chercherCase(cd.getLigne() + 1, cd.getColonne()).caseVide())
				{
					this.aBouge = true;
					return true;
				}
			}
			
			if (ca.getLigne() == cd.getLigne() + 1 && (ca.getColonne() == cd.getColonne() + 1 || ca.getColonne() == cd.getColonne() - 1))
			{
				if ((plateau.chercherCase(cd.getLigne() + 1, cd.getColonne() + 1).caseVide()) || (plateau.chercherCase(cd.getLigne() - 1, cd.getColonne() - 1).caseVide()))
				{
					this.aBouge = true;
					return true;
				}
			}
		}
		
		if (this.getCouleur() == "noir")
		{
			if (ca.getLigne() == cd.getLigne() - 2)
			{
				if(!aBouge)	
				{
					if (plateau.chercherCase(cd.getLigne() - 1, cd.getColonne()).caseVide() && plateau.chercherCase(cd.getLigne() - 2, cd.getColonne()).caseVide())
					{
						this.aBouge = true;
						return true;
					}
				}
				else
				{
					return false;
				}
			}
			
			if (ca.getLigne() == cd.getLigne() - 1)
			{
				if (plateau.chercherCase(cd.getLigne() - 1, cd.getColonne()).caseVide())
				{
					this.aBouge = true;
					return true;
				}
			}
			
			if (ca.getLigne() == cd.getLigne() - 1 && (ca.getColonne() == cd.getColonne() + 1 || ca.getColonne() == cd.getColonne() - 1))
			{
				if ((plateau.chercherCase(cd.getLigne() - 1, cd.getColonne() + 1).caseVide()) || (plateau.chercherCase(cd.getLigne() - 1, cd.getColonne() - 1).caseVide()))
				{
					this.aBouge = true;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deplacementPossible(Echiquier plateau, Case cd, Case ca)
	{
		return cheminLibre(plateau, cd, ca) && !(ca.equals(cd)) && cd.getPiece() != null; 
	}

}



