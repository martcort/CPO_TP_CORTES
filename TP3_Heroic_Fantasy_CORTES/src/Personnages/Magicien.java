/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Classe Magicien, fille de Personnage
 * Crée le 23 Oct. 2023
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author marti
 */
public class Magicien extends Personnage{ // Constructeur
    private boolean confirmed;
    public Magicien(String n, int v,boolean e) {
        super(n, v,e);
        confirmed = e;   
    }
    public void modifconf(boolean i){ // Permet de modifier la valeur confirmé 
        confirmed =i;
    }

    
}
