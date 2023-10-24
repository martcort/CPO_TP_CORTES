/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface 
 * Crée le 23 Oct. 2023
 */
package tp3_heroic_fantasy_cortes;
import Personnages.Guerrier;
import Personnages.Magicien;
import Armes. *;
import Personnages. *;

import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author marti
 */
public class TP3_Heroic_Fantasy_CORTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des armes de type épée
        Epee excalibur = new Epee("Excalibur",7,5);
        Epee durandal = new Epee("Durandal",4,7);
        Epee joyeuse = new Epee("La Joyeuse",10,11);
        
        
        // Création des armes de type baton
        Baton chene = new Baton("Chêne",4,5);
        Baton charme = new Baton("Charme",5,6);
        Baton marche = new Baton("Baton de marche",1,1);
        
        System.out.println(excalibur);
        
        // Création d'une arraylist pour stocker les armes
        ArrayList<Arme> armes;
        armes = new ArrayList<>();
        
        // Rangement des armes dans une liste "armes" de type arraylist
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(joyeuse);
        armes.add(chene);
        armes.add(charme);
        armes.add(marche);
        
        // Création du magicien
        Magicien gandalf = new Magicien("Gandalf",65, true);
        
        // Création du guerrier
        Guerrier conan = new Guerrier("Conan",78,false);
        conan.ajoutarme(marche);
        conan.ajoutarme(joyeuse);
        conan.ajoutarme(durandal);
        conan.equiper("La Joyeuse");
        
        gandalf.ajoutarme(charme);
        gandalf.ajoutarme(chene);
        gandalf.ajoutarme(durandal);
        gandalf.equiper("Charme");
        
        System.out.println(gandalf.predilection());
        System.out.println(conan.predilection());
        
        System.out.println(gandalf.specs());
        System.out.println(conan.specs());
        
        
        
        
    }
    
}
