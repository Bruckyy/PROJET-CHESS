package main;



public interface Piece {

    public String getCouleur();
    
    public void setCouleur(String newCouleur);
    
    /* Cette méthode devrait être la même pour toutes
     * tu peux la prendre dans Tour
     */
    public boolean deplacementPossible(Echiquier plateau,Case cd, Case ca);

    /* La méthode cheminLibre permet de vérifier que le chemin emprunté par la case est
     * LEGAL ET VIDE (utiliser .caseVide()
     */
    public boolean cheminLibre(Echiquier plateau, Case cd, Case ca);
    
    public String toString();

	public String getNom();
}
