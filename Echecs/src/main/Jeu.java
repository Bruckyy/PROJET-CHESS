package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {

    private Echiquier echiquier;
    
    public Jeu() {}
    
    public Jeu(Echiquier ech) {
    	this.echiquier=ech;
    	}
    
    public void setEchiquier(Echiquier ech) {this.echiquier=ech;}
    public Echiquier getEchiquier() {return this.echiquier;}
    
    
    public void save(String nomFichier) {
        try {
            System.out.println("Sauvegarde : "+nomFichier);
            BufferedWriter bw = Files.newBufferedWriter(Paths.get(nomFichier));
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
    public void restore(String nomFichier) {}
    
}
