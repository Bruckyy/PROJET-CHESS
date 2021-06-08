package main;



public interface Piece {

    public String getCouleur();
    
    public void setCouleur(String newCouleur);
    
    /* Cette m�thode devrait �tre la m�me pour toutes
     * tu peux la prendre dans Tour
     */
    public boolean deplacementPossible(Echiquier plateau,Case cd, Case ca);

    /* La m�thode cheminLibre permet de v�rifier que le chemin emprunt� par la case est
     * LEGAL ET VIDE (utiliser .caseVide()
     */
    public boolean cheminLibre(Echiquier plateau, Case cd, Case ca);
    
    public String toString();

	public String getNom();
}
