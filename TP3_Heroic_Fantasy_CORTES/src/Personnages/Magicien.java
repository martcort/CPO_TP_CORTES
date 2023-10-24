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
public class Magicien extends Personnage{
    private boolean confirmed;
    public Magicien(String n, int v, boolean conf) {
        super(n, v);
        confirmed = conf;   
    }
    public void modifconf(boolean i){
        confirmed =i;
    }

    
}
