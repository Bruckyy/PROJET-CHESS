package main;



public class Echequier {
	
    private Case[] board = new Case[64];
    
    /*	retourne l'indice de la case avec sa ligne et colonne */
    public int indexOfCase(int ligne, int colonne)
    {
    	for (int i = 0; i<this.board.length; i++)
    	{
    		if (board[i].getLigne() == ligne && board[i].getColonne() == colonne)
    		{
    			return i;
    		}
    	}
    	return -1;
    }
    
    /*	retourn l'indice de la pièce et sa couleur */
    public int indexOfPiece(Piece nomPiece, String couleur)
    {
    	for (int i = 0; i<this.board.length; i++)
    	{
    		if (board[i].getPiece() == nomPiece && board[i].getPiece().getCouleur() == couleur)
    		{
    			return i;
    		}
    	}
    	return -1;
    }

    public String toString() {
		return null;
    }

}
