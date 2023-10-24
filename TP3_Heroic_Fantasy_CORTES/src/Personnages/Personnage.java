/* Martin CORTES TDB 
 * TP3 - Héritage, classe abstraite et interface
 * Classe Personnage, mère de Magicien et Guerrier
 * Crée le 23 Oct. 2023
 */
package Personnages;

// On importe ce dont on a besoin
import java.util.ArrayList;
import Armes. *;
import tp3_heroic_fantasy_cortes.etreVivant;
/**
 *
 * @author marti
 */
public abstract class Personnage implements etreVivant{
    // Initialisation de toutes les variables nécessaires
    private String nom;
    private int nivvie;
    private ArrayList<Arme> armesperso = new ArrayList<>(); //Pour "ranger" les armes possédées par notre personnage
    private Arme armeequipee = null;                // Pour stocker l'arme equipée
    private Boolean etat;                           // Va stocker l'état dans lequel le perso est (si c'est un magicien cela 
                                                    // s'apparentera à confirmé et pour un chevalier à "à cheval" ces deux 
                                                    //valeurs étant des booleens)
    private static int nombrepersos = 0;            
    private static int nombreguerriers = 0;         // Ces variables statics stockeront les nombre de guerriers, magiciens et personnages en général
    private static int nombremagiciens = 0;
    
public int getvie(){ // Renvoie le niveau de vie du perso
    return nivvie;
}
public String getnom(){ // Renvoie le nom du perso
    return nom;
}
// Mise en place du constructeur
public Personnage(String n, int v, boolean e){
    nom = n;
    nivvie = v;
    etat = e;
    nombrepersos++; // Lorsque qu'un perso est crée ce nombre s'implémente
    if (getClass().toString().equals("class Personnages.Magicien")){
        nombremagiciens++; // S'implémente lorsqu'un magicien est crée
    }
    else{
        nombreguerriers++; // S'implémente lorsqu'un guerrier est crée
    }
}
//Mise en place du destructeur
public void finalize(){
    nombrepersos--; // dans tous les cas le nombre de perso diminuera de 1
    if (getClass().toString().equals("class Personnages.Magicien")){
        nombremagiciens --; // si c'est un magicien
    }
    else{
        nombreguerriers --; // Si c'est un guerrier  
    }
}

public void ajoutarme(Arme a){ // Permet d'ajouter des armes dans une limite de 5, un message insique lorsque cette limite est dépassée
    if(armesperso.size() < 5){
        armesperso.add(a);
        System.out.println("Arme ajoutee");
    }
    else{
        System.out.println("Inventaire du perso plein !");
    }
}
public Arme arme_en_main(){ // renvoie l'arme actuellement équipée
    return armeequipee;
}

public void equiper(String arme){ // Prend en valeur un string, va chercher si ce nom correspond avec l'une des armes de l'inventaire
    // Si c'est le cas l'arme s'équipe, sinon un message est renvoyé
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

private int countepee(){ // Renvoie le nombre d'épées présentes dans l'inventaire
    int count = 0;
    for (Arme element : armesperso){
        if (element.getClass().toString().equals("class Armes.Epee")){
            count++;
        }        
    }
    return count;
}
private int countbaton(){ //Renvoie le nombre de batons présents dans l'inventaire
    int count = 0;
    for (Arme element : armesperso){
        if (element.getClass().toString().equals("class Armes.Baton")){
            count++;
        }        
    }
    return count;
}
public String predilection(){ // Renvoie le nombres d'armes de prédilections dans l'inventaire
    
    // Si c'est un magicien cela revoie le nombre de baton
    if (getClass().toString().equals("class Personnages.Magicien")){
        return getnom()+" possede "+countbaton()+ " batons";
    }
    // Sinon c'est un guerrier donc on revoie le nombre d'épées dans l'inventaire.
    else{
        return getnom()+" possede "+countepee()+ " epees";
    }
}
public String specs(){ // Affiche les stats du perso
    return "Votre personnage "+getnom()+" a un niveau de vie de "+nivvie;
}
@Override 
public String toString(){ // Redefinition de toString pour l'adapter au modèle du personnage (nom, vie etc...)
    String texte = "Votre personnage s'appelle "+nom+" et est de niveau "+nivvie;
        if (armeequipee == null){
            return texte;
        }
        else{ // Si une arme est équipée, des infos supplémentaires la concernant.
            return texte  +" son arme " + armeequipee.toString();
        }    
    }
    @Override
    public void seFatiguer(){ // Redefinition de seFatiguer (méthode d'interface)
    System.out.println(getnom()+" se fatigue...");
    nivvie =nivvie-10; // Lorsque le personnage se fatique, sa vie baisse de 10
}
    @Override
    public boolean estVivant(){ // redefinition de estVivant 
        if (nivvie>0){ // revoie si oui ou non le perso est vivant
            System.out.println(getnom()+" est vivant");
            return true;
        }
        else{
            System.out.println(getnom()+" ne respire plus...");
            return false;
        }
    }
    @Override
    public void estAttaque(int points){
        nivvie = nivvie - points; // Redefinition de estAttaque, le perso perd x poins de vie
    }
    
    public void attaquer(Personnage perso){ // Permet au personnage d'attaquer un autre personnage "perso" 
        int degats = 0;
        degats = armeequipee.getatt()*armeequipee.getspec(); // Multiplie les dégats de l'amre equipée par la spec de l'arme (=age si baton, =finesse si épée)
        seFatiguer();
        
        if(perso.etat==true){ // Si l'état (=confirme si magicien, =à cheval si guerrier) est vrai les dégats subis par perso sont divisés par 2
            degats = degats/2;
        }
        
        if (armeequipee==null){ //Toutefois si aucune arme n'est équipée l'attque fera 0 dégats et un message s'affiche.
            degats = 0;
            System.out.println("Aucune arme équipée");
        }
        perso.estAttaque(degats);
    }
}
