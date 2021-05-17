package main;
import java.util.List;

public interface Piece {

    public String[] couleur = {"blanc","noir"};
    public static int position = 0;
    public int[] coupsPossibles = {};

    public void actu();
    public String getPos();
    public String getCouleur();
    public void setPos();
    public void setCouleur();
    public void deplacer();
    public List<Integer> coupsPossibles();
    public void supprimer();
    public boolean caseOccupe();
    public String toString();
}
