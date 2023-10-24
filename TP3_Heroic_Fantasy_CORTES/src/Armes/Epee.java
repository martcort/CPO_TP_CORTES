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

    public Epee(String n, int niv, int f) {
        super(n, niv);
        finesse = f;
    }
    public String gettype(){
        return "epee";
    }
@Override
public String toString(){
    return super.toString()+", cette epee a une finesse de "+finesse;       
}
}
