/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Classe Baton, fille de Arme
 * Crée le 23 Oct. 2023
 */
package Armes;

/**
 *
 * @author marti
 */
public class Baton extends Arme{
    private int age;

    public Baton(String n, int niv, int a) {
        super(n, niv);
        age = a;
    }
        public String gettype(){
        return "baton";
    }
@Override
public String toString(){
    return super.toString()+", ce baton a un age de"+age+"ans";       
}
}
