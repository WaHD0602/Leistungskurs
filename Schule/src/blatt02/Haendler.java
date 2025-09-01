package blatt02;
import java.util.Scanner;
public class Haendler {
    public static void main(String[] args) {
        Scanner baba =  new Scanner(System.in);
        System.out.println("Wie viele normale SD-Karten möchten sie?");
        int anzahlNormal = baba.nextInt();
        System.out.println("Wie viele Mini SD-Karten möchten sie?");
        int anzahlMini = baba.nextInt();
        System.out.println("Wie viele Micro SD-Karten möchten sie?"); //todo wie auch überall davor einfach den wert durch eine Scanner abfrage ersetzen
        int anzahlMicro = baba.nextInt();
        double normalsd = 5;
        double minisd = 8;
        double microsd = 12;
        double preis = anzahlNormal * normalsd + anzahlMini * minisd + anzahlMicro * microsd;
        System.out.println("Der Preis für... \n" + anzahlNormal  + " normale SD-Karten \n" + anzahlMini + " MiniSD-Karten \n" + anzahlMicro + " MicorSD-Karten\n... lautet " + preis + "€");

    }
}
