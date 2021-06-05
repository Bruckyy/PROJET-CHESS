package main;



public interface Piece {

    public String getCouleur();
    
    public void setCouleur(String newCouleur);

    public Case[] deplacementTab(Case cd, Case ca);

    public String toString();
}
