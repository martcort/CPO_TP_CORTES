/*
 * TP 2 - Bieres - Découverte du paradygme objet
 * Martin Cortes FG2
 * Créé le vendredi 6 octobre 2023
 * Dernière modification : 06/10/23
 */
package tp2_bieres_cortes_friez;

/**
 *
 * @author marti
 */
public class TP2_Bieres_CORTES_FRIEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Desbuissons") ;
        BouteilleBiere dodo = new BouteilleBiere("dodo",7.0,"Bourbon") ;
        dodo.ouvert = 0;
        
        BouteilleBiere despe = new BouteilleBiere("Desperados", 7.3,"Heineken");
        despe.ouvert = 0;
        uneBiere.lireEtiquette();
        uneBiere.ouvert = 0;
        
        System.out.println(uneBiere.ouvert);
        System.out.println(uneBiere);
        uneBiere.Decapsuler();
        dodo.Decapsuler();
        System.out.println(dodo);
        
    }
    
}
