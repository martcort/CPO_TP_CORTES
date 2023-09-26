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
        
        byte victoire = 0;
        int i=1;
        while(victoire ==0){
            System.out.println("Tentative "+i);
            System.out.println("Entrez une valeur:");
            int user = sc.nextInt();
            if (user>n){
                System.out.println("Trop grand");
            }
            if (user<n){
                System.out.println("Trop petit");
            }
            if (user==n){
                System.out.println("Victoire !");
                victoire = 1;
            }
            i = i+1;
            if (i==limite)
        }
    }
}
