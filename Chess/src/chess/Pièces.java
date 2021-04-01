package chess;

public class Pièces {
	
	private String couleur;
	private int position;
	private String[] coups;
	
	public Pièces(){
		
	}
	
	public void setPos(int newPos) {
		this.position= newPos;
	}
	
	public int getPos() {
		return this.position;
	}

	public String getCouleur() {
		return this.couleur;
	}
	
	public void deplacer(int pos) {
		
	}

}
