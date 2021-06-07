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
    public Jeu(Echiquier ech) {this.echiquier=ech;}
    
    public void setEchiquier(Echiquier ech) {this.echiquier=ech;}
    public Echiquier getEchiquier() {return this.echiquier;}
    
    
    public static void save(String nomFichier) {}
    public void restore(String nomFichier) {}
    
}
