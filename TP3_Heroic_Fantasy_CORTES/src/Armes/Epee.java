/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Classe Epee, fille de Arme
 * Crée le 23 Oct. 2023
 */
package Armes;

/**
 *
 * @author marti
 */
public class Epee extends Arme{
    private int finesse;

    public Epee(String n, int niv, int sp) { // Constructeur
        super(n, niv,sp);
        finesse = sp;
    }
    public int getfinesse(){ // Retourne la finesse de l'épée
        return finesse;
    }
@Override
public String toString(){ // On redéfinit le toString déjà redéfini de la classe arme pour l'adapter au modèle de l'épée
    return super.toString()+", cette epee a une finesse de "+finesse;       
}
}
