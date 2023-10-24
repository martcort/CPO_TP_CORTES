/*
 * TP 2 : Manipulation des objets (par leur référence)
 * Vendredi 13.10.2023
 *  Martin CORTES, Elisa FRIEZ
 */
package tp2_manip_cortes_friez;

/**
 *
 * @author marti
 */
public class TP2_manip_CORTES_FRIEZ {

    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2 ; 
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;

        
    }
    
}
