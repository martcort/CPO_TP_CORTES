/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Classe Personnage, mère de Magicien et Guerrier
 * Crée le 23 Oct. 2023
 */
package Personnages;

import java.util.ArrayList;
import Armes. *;
/**
 *
 * @author marti
 */
public abstract class Personnage {
    private String nom;
    private int nivvie;
    private ArrayList<Arme> armesperso = new ArrayList<>();
    private Arme armeequipee = null;
    private static int nombrepersos = 0;
    private static int nombreguerriers = 0;
    private static int nombremagiciens = 0;
    
public int getvie(){
    return nivvie;
}
public String getnom(){
    return nom;
}
// Mise en place du constructeur
public Personnage(String n, int v){
    nom = n;
    nivvie = v;
    nombrepersos++;
    if (getClass().toString().equals("class Personnages.Magicien")){
        nombremagiciens++;
    }
    else{
        nombreguerriers++;    
    }
}
//Mise en place du destructeur
public void finalize(){
    nombrepersos--;
    if (getClass().toString().equals("class Personnages.Magicien")){
        nombremagiciens --;
    }
    else{
        nombreguerriers --;     
    }
}

public void ajoutarme(Arme a){
    if(armesperso.size() < 5){
        armesperso.add(a);
        System.out.println("Arme ajoutee");
    }
    else{
        System.out.println("Inventaire du perso plein !");
    }
}
public Arme arme_en_main(){
    return armeequipee;
}

public void equiper(String arme){
    int result = 0;
    for(Arme element : armesperso){
        if(element.getname().equals(arme)){
            armeequipee = element;
            result = 1;
            break;
        }
    }
    if(result ==0){
        System.out.println(arme+ " n'est pas presente dans votre inventaire");
    }
    else{
        System.out.println(arme+" equipee");
    }   
}

private int countepee(){
    int count = 0;
    for (Arme element : armesperso){
        if (element.getClass().toString().equals("class Armes.Epee")){
            count++;
        }        
    }
    return count;
}
private int countbaton(){
    int count = 0;
    for (Arme element : armesperso){
        if (element.getClass().toString().equals("class Armes.Baton")){
            count++;
        }        
    }
    return count;
}
public String predilection(){
    if (getClass().toString().equals("class Personnages.Magicien")){
        return getnom()+" possede "+countbaton()+ " batons";
    }
    else{
        return getnom()+" possede "+countepee()+ " epees";
    }
}
public String specs(){
    return "Votre personnage "+getnom()+" a un niveau de vie de "+nivvie;
}
@Override 
public String toString(){
    String texte = "Votre personnage s'appelle "+nom+" et est de niveau "+nivvie;
        if (armeequipee == null){
            return texte;
        }
        else{
            return texte  +" son arme " + armeequipee.toString();
        }    
    }
}
