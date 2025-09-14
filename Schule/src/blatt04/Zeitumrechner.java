package blatt04;
import java.util.Scanner;
public class Zeitumrechner {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Gebe eine positive Zahl an Sekunden ein:");
        int sekunden = baba.nextInt();
        int minuten = 0;
        int stunden = 0;
        int tage = 0;
        int anzahl = 0;

        while (sekunden >= 60) {
            minuten++;
            sekunden -= 60;
            anzahl++;
        }

        while (minuten >= 60) {
            stunden++;
            minuten -= 60;
            anzahl++;
        }

        while (stunden >= 24) {
            tage++;
            stunden -= 24;
            anzahl++;
        }

        System.out.println(tage + " Tage, " + stunden + " Stunden, " + minuten + " Minuten, " + sekunden + " Sekunden. Es hat " + anzahl + " Durchgänge gebraucht!"); //in b hat es 151638 durchgänge gebraucht
    } //C) ich glaube es könnte mit dem werten für stunden tage und minuten schneller gehen wenn diese alle auf sekunden bezogen sind und man dividiert bin mir aber auch nicht sicher
}
