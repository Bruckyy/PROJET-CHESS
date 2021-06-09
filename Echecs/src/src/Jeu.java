package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import src.*;
public class Jeu {

    private Echiquier echiquier;
    private String turn;
    private Scanner sc = new Scanner(System.in);
    
    public Jeu() {
    	this.init();
    	this.affichage();
    }
    
    public Jeu(Echiquier ech, String turn) {
    	this.echiquier=ech;
    	this.turn = turn;
    	}
    
    public void setTurn(String turn) {
    	this.turn = turn;
    }
    
    
    public void setEchiquier(Echiquier ech) {
    	this.echiquier=ech;
    }
    
    public Echiquier getEchiquier() {
    	return this.echiquier;
    }
    
    public String getTurn() {
    	return this.turn;
    }
    
    public void init()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Choisissez votre mode de jeu : classique, berger (c/b).\n");
    	String mode = sc.nextLine();
    	
    	
    	if (mode.contentEquals("c")) {
    		System.out.println("Vous avez choisi le mode classique.");
    	}
    	
    	if (mode.contentEquals("t")) {
    		System.out.println("Vous avez choissi le mode pour la tour");
    	}
    	
    	this.echiquier = new Echiquier(mode);
    	this.turn = "blanc";
  
    }
    
    public void affichage()
    {
    	System.out.println(this.echiquier.toString());
    	System.out.println("Tour: " + this.turn);
    }
    
    public void entrerCoup()
    {

    	System.out.println("Votre coup (cd,ca): ");
    	String coup = sc.nextLine();
    	String cd = String.valueOf(coup.charAt(0)) + String.valueOf(coup.charAt(1));
    	String ca = String.valueOf(coup.charAt(3)) + String.valueOf(coup.charAt(4));
    	int cdLigne = this.conversion(cd)[1];
    	int cdColonne = this.conversion(cd)[0];
    	int caLigne = this.conversion(ca)[1];
    	int caColonne = this.conversion(ca)[0];
    	
    	this.echiquier.deplacerPiece(this.echiquier.chercherCase(cdLigne, cdColonne), this.echiquier.chercherCase(caLigne, caColonne));  
    
    }
    
    public int[] conversion(String coupEntree)
    {
    	int[] tabCase = new int[2];
    	
    	int j = 1;
    	for (int i = 97; i < 105; i ++)
    	{
    		if (coupEntree.charAt(0) == ((char) i))
        	{
        		tabCase[0] = j;
        	}
    		j ++;
    	}
    	
    	tabCase[1] = (int) coupEntree.charAt(1) - 48;
    	return tabCase;
    }
    
    
    
    public void save(String nomFichier) {
        try {
            System.out.println("Sauvegarde : "+nomFichier);
            BufferedWriter bw = Files.newBufferedWriter(Paths.get(nomFichier));
            bw.write(this.getTurn()+"\n");
            for(int x=8;x>0;x--) {
            	for(int y=1;y<8;y++) {
            		String result= this.getEchiquier().chercherCase(x,y).toString()+" ";
            		bw.write(result);
            	}
            	bw.write("\n");
            }
            bw.close();
        } catch(IOException e){
            System.err.println(e);
        }
    }
    public Jeu restore(String nomFichier) {
    	try {
    		BufferedReader br = Files.newBufferedReader(Paths.get(nomFichier));
    		String[] ligne;
    		int i=0;
    		Echiquier ech = new Echiquier(new ArrayList<Case>());
    		String tour = br.readLine();
    		
    		ligne = br.readLine().split(" ");
    		while(ligne!=null) {
    			if(ligne[i]=="♟") {
    				Case c = new Case(2,3,new Pieces("blanc", "pion"));
    			}
    			if(ligne[i]=="♙") {
    				
    			}
    			if(ligne[i]=="♜") {
    				
    			}
    			if(ligne[i]=="♖") {
    				
    			}
    			if(ligne[i]=="♞") {
    				
    			}
    			if(ligne[i]=="♘") {
    				
    			}
    			if(ligne[i]=="♝") {
    				
    			}
    			if(ligne[i]=="♗") {
    				
    			}
    			if(ligne[i]=="♛") {
    				
    			}
    			if(ligne[i]=="♕") {
    				
    			}
    			if(ligne[i]=="♚") {
    				
    			}
    			if(ligne[i]=="♔") {
    				
    			}
    			i++;
    		}
    		
    	}catch(IOException e) {
    		System.err.println(e);
    	}
    }
    
}
