package blatt04;
import java.util.Scanner;
public class Potenzierung {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Geben Sie eine Basis Zahl ein!");
        double basis = baba.nextDouble();
        System.out.println("Geben Sie einen Exponenten ein!");
        double exponent = baba.nextDouble();
        //die abfrage für unsere Werte

        int anzahl = 0; //einfach ein zähler
        double ergebnis = 1; //ergebnis muss 0 sein denn 5^0 ist 1

        if (exponent == 0) {
            System.out.println("Ihr Ergebnis ist " + basis + "da es hoch 0 immer 1 ist!");
            System.exit(0);
        }
        //so wird der sonderfall abgedäckt bzw abgefragt und ausgegeben

        while (anzahl < exponent) { //bedienung da es immer hoch zählt
            ergebnis = ergebnis * basis; //das ergebnis wird immer wieder mit sich selbst multipliziert und solange bis der exponent kleiner als die anzahl ist
            anzahl++; //zähler damit es keine unendliche Schleife ist
        }

        if (exponent < 0) { //so frage ich die minus exponenten ab weil sich da nie verändern
            while (anzahl > exponent) { //da der exponent negativ ist brauche eine neue schleife weil ich ja unter dem zähler bin
                ergebnis = ergebnis * basis;
                anzahl--; //zaehler andersrum
            }
            ergebnis = 1 / ergebnis; //weg um es zu berechnen wenn es minus geht
        }

        System.out.println("Ihr Ergebnis ist " + ergebnis + "!");
    }

}
