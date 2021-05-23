package main;



public interface Piece {

    public Case getCase();
    public String getCouleur();
    
    public void setCase(Case newCase);
    public void setCouleur(String newCouleur);

    public boolean verifDeplacement(Case cd, Case ca);

    public String toString();
}
