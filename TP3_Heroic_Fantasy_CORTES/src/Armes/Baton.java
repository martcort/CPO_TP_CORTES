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

    public Baton(String n, int niv, int sp) { // COntructeur
        super(n, niv, sp);
        age = sp;
    }
    public int getage(){ // Renvoie l'age du baton
        return age;
    }
@Override
public String toString(){ // Redefinition du toString de la classe arme (super), pour y ajouter des infos relatives au fait que ce soit un baton
    return super.toString()+", ce baton a un age de"+age+"ans";       
}
}
