package blatt03;
import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {
        Scanner baba =  new Scanner(System.in);
        int maximal = 50;
        int negativ = 0;
        System.out.println("Wie viele normale SD-Karten möchten sie?");
        int anzahlNormal = baba.nextInt();

        if (anzahlNormal < negativ) {
            System.out.println("Sie können keine negative Zahl eingeben!");
            System.exit(0);
        }

        if (anzahlNormal > maximal) {
            System.out.println("Deine Anzahl wurde auf 50 runtergesetzt da dass, das Maximale ist!");
            anzahlNormal = 50;
        }

        System.out.println("Wie viele Mini SD-Karten möchten sie?");
        int anzahlMini = baba.nextInt();

        if (anzahlMini < negativ) {
            System.out.println("Sie können keine negative Zahl eingeben!");
            System.exit(0);
        }

        if (anzahlMini > maximal) {
            System.out.println("Deine Anzahl wurde auf 50 runtergesetzt da dass, das Maximale ist!");
            anzahlMini = 50;
        }

        System.out.println("Wie viele Micro SD-Karten möchten sie?!"); //todo gleiche wie amiibo darf nicht negativ sein wegen geschenk
        int anzahlMicro = baba.nextInt();

        if (anzahlMicro < negativ) {
            System.out.println("Sie können keine negative Zahl eingeben!");
            System.exit(0);
        }

        if (anzahlMicro > maximal) {
            System.out.println("Deine Anzahl wurde auf 50 runtergesetzt da dass, das Maximale ist!");
            anzahlMicro = 50;
        }

        int insgesamt = anzahlNormal + anzahlMicro + anzahlMini;
        int rabatt = 15;
        double normalsd = 5;
        double minisd = 8;
        double microsd = 12;
        double preis = anzahlNormal * normalsd + anzahlMini * minisd + anzahlMicro * microsd;

        if (insgesamt > rabatt) {
            System.out.println("Sie haben einen Mengenrabatt von 15% erhalten, da sie über 15 Waren im Warenkorb haben");
            preis = preis *0.85;
        }

        System.out.println("Der Preis für... \n" + anzahlNormal  + " normale SD-Karten \n" + anzahlMini + " MiniSD-Karten \n" + anzahlMicro + " MicorSD-Karten\n");
        System.out.printf( "...lautet %.2f € " ,preis);

    }
}
