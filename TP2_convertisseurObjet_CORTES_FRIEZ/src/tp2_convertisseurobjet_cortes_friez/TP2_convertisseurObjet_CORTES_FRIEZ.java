/*
 * TP2 Un convertisseur de températures
 * Martin CORTES FG2
 * Créé le 06.10.2023
 * Dernière modif. le 06.10.2023
 */
package tp2_convertisseurobjet_cortes_friez;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP2_convertisseurObjet_CORTES_FRIEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur convert = new Convertisseur();
        int i = 0;
        System.out.println("Bonjour !!");
        while(i <1){
        System.out.println(" *-* \nSaisissez une temperature a convertir ci-dessous");
        double t = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer:");
        System.out.println("1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");
        int rep = sc.nextInt();
        if (rep==1){
            System.out.println(Convertisseur.CelciusVersKelvin(t));
            convert.nbConversions +=1;
            System.out.println(convert);
        }
        if (rep==2){
            System.out.println(Convertisseur.KelvinVersCelcius(t));
            convert.nbConversions +=1;
            System.out.println(convert);
        }
        if (rep==3){
            System.out.println(Convertisseur.FarenheitVersCelcius(t));
            convert.nbConversions +=1;
            System.out.println(convert);
        }
        if (rep==4){
            System.out.println(Convertisseur.CelciusVersFarenheit(t));
            convert.nbConversions +=1;
            System.out.println(convert);
        }
        if (rep==5){
            System.out.println(Convertisseur.KelvinVersFarenheit(t));
            convert.nbConversions +=1;
            System.out.println(convert);
        }
        if (rep==6){
            System.out.println(Convertisseur.FarenheitVersKelvin(t));
            convert.nbConversions +=1;
            System.out.println(convert);
        }
        
    }
    
}
}
