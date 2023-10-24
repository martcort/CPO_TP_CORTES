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
    // On initialise toutes les variables nécéssaires.
    private String nom;
    private int nivatt;
    private int spec;
public int getatt(){ // Renvoie le niveau d'attaque de l'arme
    return nivatt;
}
public String getname(){ // Renvoie le nom de l'arme
    return nom;
}
public Arme(String n, int niv,int sp){ // COntructeur
    nom = n;
    nivatt = niv;
    spec = sp;
}
public int getspec(){ // Renvoie la spec de l'arme(=age si baton, = finesse si épée)
    return spec;
}
@Override
public String toString(){ // redefinition de toString pour s'adapter à l'obet arme (affiche le nom et le niveau d'attaque)
    String texte = nom+" est de niveau "+nivatt;
    return texte;
}
}
