/*
 * TP1 Saisie et manipulation des nombres
 * Martin CORTES
 * 26/09/2023
 */
package tp1_manipnombresint_cortes_friez;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_manipNombresInt_CORTES_FRIEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier n1");
        int n1 = sc.nextInt();
        System.out.println("Saisissez un entier n2");
        int n2 = sc.nextInt();
        
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);
        System.out.println("n1+n2 = "+(n1+n2));
        System.out.println("n1-n2 = "+(n1-n2));
        System.out.println("n1*n2 = "+(n1*n2));
        System.out.println("n1 divisé par n2 vaut "+(n1/n2));
        System.out.println("Il reste"+ (n1%n2));
    }     
}
