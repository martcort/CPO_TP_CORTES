/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Interface etreVivant
 * Crée le 24 Oct. 2023
 */
package tp3_heroic_fantasy_cortes;

/**
 *
 * @author marti
 */
public interface etreVivant {
    // Création de méthodes (donc sans corps car étant une interface)
    public void seFatiguer();
    public boolean estVivant();
    public void estAttaque(int points);
    
    
}
