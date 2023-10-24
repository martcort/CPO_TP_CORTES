/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Classe Arme, mère de Epee et Baton
 * Crée le 23 Oct. 2023
 */
package Armes;

/**
 *
 * @author marti
 */
public abstract class Arme {
    private String nom;
    private int nivatt;
public int getatt(){
    return nivatt;
}
public String getname(){
    return nom;
}
public Arme(String n, int niv){
    nom = n;
    nivatt = niv;
}
@Override
public String toString(){
    String texte = nom+" est de niveau "+nivatt;
    return texte;
}
}
