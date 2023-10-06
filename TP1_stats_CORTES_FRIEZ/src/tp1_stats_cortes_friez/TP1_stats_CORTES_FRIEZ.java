package tp1_stats_cortes_friez;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_stats_CORTES_FRIEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        int n;
        int[] tableau  =new int[]{0,0,0,0,0,0};
        System.out.println("Entrez un entier m");
        int m = sc.nextInt();
        double result;
        
        for (int i=0;i<m;i++){
            n = generateurAleat.nextInt(6);
            tableau[n]++;
        }
        for (int u=0;u<6;u++){
            result = tableau[u]/m;
            System.out.println(result*100);
        }
            
    }
    
}
