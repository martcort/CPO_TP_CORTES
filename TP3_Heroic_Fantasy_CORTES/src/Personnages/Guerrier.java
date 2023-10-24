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

    public void modifcheval(boolean i){
        cheval = i;
    }
    public Guerrier(String n, int v, boolean c) {
        super(n, v);
        cheval = c;
        
        
    }
    
}
