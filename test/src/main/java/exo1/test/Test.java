/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exo1.test;

/**
 *
 * @author marti
 */
public class Test {

    public static void main(String[] args) {
    int nb=15;
    int fibonacci=0;
    int a = 0;
    if (nb==0){
        fibonacci = 0;
    }
    if(nb==1){
        fibonacci = 1;
    }
    else{
        for(int i=2;i<=nb;i++){
            fibonacci = fibonacci + a;
            a = fibonacci;
        }
    }
    }
}
