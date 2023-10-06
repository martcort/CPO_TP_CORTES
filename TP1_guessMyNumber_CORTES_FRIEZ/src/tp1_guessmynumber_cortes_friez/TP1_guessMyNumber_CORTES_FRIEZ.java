/*
 * TP1 Exo 3 Guess My Number
 * Martin CORTES
 * 26/09/2023
 */
package tp1_guessmynumber_cortes_friez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_guessMyNumber_CORTES_FRIEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        int n = generateurAleat.nextInt(100);
        int limite = 0;
        int alea;
        byte fin = 0;
        int i=1;
        byte indications = 1;
        System.out.println("Chosissez votre difficulté :");
        System.out.println("Facile");
        System.out.println("Moyen");
        System.out.println("Difficile");
        System.out.println("CAUCHEMAR");
                
        int dif = sc.nextInt();
        if (dif==1){
            limite = 15;
        }
        if (dif==2){
            limite = 10;
        }
        if (dif==3){
            limite = 5;
            indications = 0;
        }
        if (dif==4){
            limite = 5;
            indications = 0;
        }
        while(fin ==0){
            System.out.println("Tentative "+i);
            System.out.println("Entrez une valeur:");
            int user = sc.nextInt();
            
            if (indications==1){
                    if (-5<n-user && n-user<5){
                        System.out.println("Tres proche");
                    }
                }
            
            if (user>n){
                if (dif == 4){
                    alea = generateurAleat.nextInt(100);
                    if (alea>70){
                        System.out.println("Trop petit !");
                    }
                    else{
                        System.out.println("Trop grand");
                    }
                }
                else{
                System.out.println("Trop grand");
                }
            }
            if (user<n){
                if (dif == 4){
                    alea = generateurAleat.nextInt(100);
                    if (alea>70){
                        System.out.println("Trop grand !");
                    }
                    else{
                        System.out.println("Trop petit");
                    }
                }
                else{
                System.out.println("Trop petit");
            }
            if (user==n){
                System.out.println("Victoire ! Apres "+i+" tentatives.");
                fin = 1;
                }
            }
            i = i+1;
            if (i>limite){
                System.out.println("Defaite la limite de "+limite+" tentatives a ete excedee");
                fin = 1;
            }
            
        }
    }
}       
