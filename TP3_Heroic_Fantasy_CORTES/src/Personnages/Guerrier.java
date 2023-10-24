/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Classe Magicien, fille de Personnage
 * Crée le 23 Oct. 2023
 */
package Personnages;

/**
 *
 * @author marti
 */
public class Guerrier extends Personnage{
    private boolean cheval;

    public void modifcheval(boolean i){ // Permet de modifier la variable a cheval
        cheval = i;
    }
    public Guerrier(String n, int v, boolean e) { // Contructeur
        super(n, v, e);
        cheval = e;
        
        
    }
    
}
