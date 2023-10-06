/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_cortes_friez;

/**
 *
 * @author marti
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    byte ouvert;
public void lireEtiquette(){
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
}    
public byte Decapsuler(){
    byte statut = 0;
    if (ouvert == 0){
        ouvert = 1;
        return statut;
    }
    else{
        statut = 1;
        System.out.println("Erreur : La bouteille est déjà ouverte.");
        return statut;
    }
}
public BouteilleBiere(String unNom, double unDegre, String
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouvert = 0;
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degres)Ouverte ? ";
if (ouvert == 1 ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}

}

