/*
 * Classe pour le TP2 : Un convertisseur de températures
 * Martin CORTES FG2
 * Créé le 06.10.2023
 * Dernière modif. le 06.10.2023
 */
package tp2_convertisseurobjet_cortes_friez;

/**
 *
 * @author marti
 */
public class Convertisseur {
    int nbConversions = 0;
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
@Override
public String toString() {
return "Le nombre de conversions est de " + nbConversions;
}
}
