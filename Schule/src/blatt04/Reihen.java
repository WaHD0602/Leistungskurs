package blatt04;
import java.util.Scanner;

public class Reihen {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);

        System.out.println("Wie viele Zahlen möchtest du pro Reihe ausgeben?");
        int anzahl = baba.nextInt();

        if (anzahl < 0) {
            System.out.println("Sie können nicht negativ viele Zahlen ausgeben");
            System.exit(0);
        }

        //Reihe 1
        System.out.print("Reihe 1: ");
        int reihe1 = 1; //grundwert
        int zaehler1 = 0; //zähler für die anzahl

        while (zaehler1 < anzahl) { //abfrage ob die anzahl überschritten wurde
            System.out.print(reihe1 + " ");
            reihe1++;
            zaehler1++;
            //einfacher code weil es ja immer nur +1 ist
        }
        System.out.println();

        //Reihe 3
        System.out.print("Reihe 2: ");
        int zahl2 = 2;
        int zaehler2 = 0;

        while (zaehler2 < anzahl) {
            System.out.print(zahl2 + " ");
            zahl2+= 2; //einfach immer +2
            zaehler2++;

        }
        System.out.println();

        //Reihe 3
        System.out.print("Reihe 3: ");
        int zahl3 = 1;
        int zaehler3 = 0;

        while (zaehler3 < anzahl) {
            int rechnung = zahl3 * zahl3; //eine neue variable um immer +1 rechnen zu können und trotzdem noch mal rechnen können
            System.out.print(rechnung + " ");
            zahl3++;
            zaehler3++;
        }
        System.out.println();

        //Reihe 4
        System.out.print("Reihe 4: ");
        int zahl4 = 1;
        int zaehler4 = 0;

        while (zaehler4 < anzahl) {
            System.out.print(zahl4 + " ");
            zaehler4++;

            if (zaehler4 < anzahl) {
                System.out.print((-zahl4) + " ");
                zaehler4++;
            }
            zahl4++;
            //bei reihe 4 hats gekracht aber habe irgendwann einfach zahl 4 im minus ausgegeben und dann immer +1 wie es auch ist ohne minus rechnen zu müssen
        }
    }
}
