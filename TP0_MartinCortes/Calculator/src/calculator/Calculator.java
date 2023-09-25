/*
 * TPO Calculator
 * Martin Cortes 
 * Lun. 25/09/2023
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please, select an operator");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        int selection;
        float operande1;
        float operande2;
        float result;
        
        result = 0;
        
        Scanner sc = new Scanner(System.in);
        selection=sc.nextInt(); // On demande a sc de donner le prochain entier
        if (selection )
        
        System.out.println("First number:");
        operande1 = sc.nextInt();
        
        System.out.println("Second number:");
        operande2 = sc.nextInt();
        
        if (selection == 1){
            result = operande1 + operande2;
        }
        if (selection == 2){
            result = operande1 - operande2;
        }
        if (selection == 3){
            result = operande1 * operande2;
        }
        if (selection == 4){
            result = operande1 / operande2;
        }
        if (selection == 5){
            result = operande1%operande2; //Renvoie le reste de la division euclidienne.
        }  
        System.out.println("The result is "+ result);
    }   
}
