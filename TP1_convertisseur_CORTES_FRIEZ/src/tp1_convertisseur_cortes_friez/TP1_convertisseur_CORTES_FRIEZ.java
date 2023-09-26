/*
 * TP1 Exo 2 Un convertisseur de températures
 * Martin CORTES
 * 26/09/2023
 */
package tp1_convertisseur_cortes_friez;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class TP1_convertisseur_CORTES_FRIEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour !!");
        System.out.println("Saisissez une température à convertir ci-dessous");
        double t = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer:");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius ");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        int rep = sc.nextInt();
        if (rep==1){
            System.out.println(CelciusVersKelvin(t));
        }
        if (rep==2){
            System.out.println(KelvinVersCelcius(t));
        }
        if (rep==3){
            System.out.println(FarenheitVersCelcius(t));
        }
        if (rep==4){
            System.out.println(CelciusVersFarenheit(t));
        }
        if (rep==5){
            System.out.println(KelvinVersFarenheit(t));
        }
        if (rep==6){
            System.out.println(FarenheitVersKelvin(t));
        }
    }
    public static double CelciusVersKelvin (double tCelcius) {
         double tKelvin = tCelcius + 273.15;
         return tKelvin;
    }
    public static double KelvinVersCelcius (double tKelvin) {
         double tCelcius = tKelvin - 273.15;
         return tCelcius;
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
         double tCelcius = (tFarenheit -32)/1.8;
         return tCelcius;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
         double tFarenheit = (tCelcius*1.8) + 32;
         return tFarenheit;
    }
    public static double KelvinVersFarenheit (double tKelvin) {
         double tFarenheit = CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
         return tFarenheit;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
         double tKelvin = CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
         return tKelvin;
    }
    
}
