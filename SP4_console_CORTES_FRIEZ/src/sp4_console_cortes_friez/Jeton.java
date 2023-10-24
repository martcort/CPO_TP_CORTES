/*
 * Martin CORTES
 * TP 3 - SuperPuissance 4
 * Classe Jeton
 * Création : 18.10.2023
 */
package sp4_console_cortes_friez;

/**
 *
 * @author marti
 */
public class Jeton{
    private final String couleur;
    
//Contructeur ne prenant que la couleur en argument.
public Jeton(String c){
couleur = c;
}

// Méthode pour lire la couleur.
public String lireCouleur(){
        return couleur;
}

// ToString modifié pour renvoyer R ou J selon la couleur du jeton.
@Override
public String toString() {
String val = null;
if("jaune".equals(couleur)){
    val = "J";
}
else{
   val = "R"; 
}

return val ;
}
}