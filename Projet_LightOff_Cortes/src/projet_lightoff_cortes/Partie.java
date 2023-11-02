/*
 * Martin CORTES TDB
 * Projet LightOff
 * Classe 
 * 25.10.2023
 */
package projet_lightoff_cortes;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Partie {
    GrilleDeCellules grille;
    int nbCoups;
    int abs;
    int ord;
    public Partie(int x,int y){
        nbCoups = 0;
        grille = new GrilleDeCellules(x,y);
        abs = x;
        ord = y;
    }
    
    // ------   Traitement du texte -----------
    private static boolean estCaractere(String str) {
        return str.length() == 1;
    }
    
    private static boolean estLettre(char caractere) {
        return Character.isLetter(caractere);
    }

    private static boolean estChiffre(char caractere) {
        return Character.isDigit(caractere);
    }

    private static boolean estLettreOuChiffre(char caractere) {
        return estLettre(caractere) || estChiffre(caractere);
    }
    
    private static int lettreEnLigne(String lettre) {
        // Assurez-vous que la lettre est en majuscules
        lettre = lettre.toUpperCase();
        // Vérifiez si la lettre est une lettre de l'alphabet
        if (lettre.length() != 1 || !Character.isLetter(lettre.charAt(0))) {
            throw new IllegalArgumentException("L'entrée n'est pas une lettre.");
        }
        // Convertissez la lettre en un numéro de ligne (A=1, B=2, C=3, etc.)
        return lettre.charAt(0) - 'A';
    }

    private static int chiffreEnColonne(String chiffre) {
        try {
            // Convertissez la chaîne de chiffres en un numéro de colonne
            return Integer.parseInt(chiffre);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("L'entrée n'est pas un nombre valide.");
        }
    }
    
    // ------------ Traitement de la partie ------------
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(5);
    }
    public void lancerPartie(){
        Scanner scan = new Scanner(System.in);
        boolean etatPartie = false;
        int coups = 1;
        System.out.println(grille);
        
        while(etatPartie==false){
            System.out.println("Coup numero "+coups+" , a vous de jouer !   ");
            System.out.println("Entrez votre colonne/ligne :");
            String texte = scan.next();
            
            int ligne;
            int colonne;
            char lettreCol =(char)('A'+abs-1);
            
            if(estCaractere(texte)==true){
                char caractere = texte.charAt(0);
                if(texte.toUpperCase().equals("Y")){
                    grille.activerDiagonaleDescendante();
                    coups++;
                }
                else if(texte.toUpperCase().equals("Z")){
                    grille.activerDiagonaleMontante();
                    coups++;
                }
                else if (estLettre(caractere)==true){
                    ligne = lettreEnLigne(texte);
                    if(0<=ligne && ligne < ord){
                        grille.activerLigneDeCellules(ligne);
                        coups++;
                    }
                    else{
                        System.out.println("Veuillez entrer une colonne comprise entre A et "+lettreCol+" !");
                    }
                    
                }
                else if (estChiffre(caractere)==true){
                    colonne = chiffreEnColonne(texte);
                    if (0<=colonne && colonne <abs){
                    grille.activerColonneDeCellules(colonne);
                    coups++;
                    }
                    else{
                        System.out.println("Veuillez entrer une ligne comprise entre 0 et "+(ord-1)+" !");
                    }
                }
                else{
                    System.out.println("Veuillez saisir un caractère valide.");
                }

            }
            else{
                System.out.println("Veuillez saisir UN SEUL caractère");
            }
            System.out.println(grille);
            if(grille.cellulesToutesEteintes()==true){
                etatPartie = true;
            }
            
        }
        System.out.println("Partie terminee ! (en "+(coups-1)+" coups)");
    }
}
