package blatt04;

import java.util.Scanner;
/*
|-----------------------------------------------------------------------------------|
Aufgabe:
Du kennst sicherlich die Sportart Dart. Falls nicht ist das gar kein Problem,
denn hier sind die nochmal die Regeln (verkürtzt):
1. Ein Dartspiel beginnt bei 501 Punkten.
2. Ein Spieler kann in jeder Runde eine Punktzahl zwischen 0-180.
3. Die geworfenen Punkte werden in jeder Runde von der Gesamtpunktzahl abgezogen.
4. Das Spiel endet, wenn man exakt 0 Punkte erreicht. Sollte man ins negative geraten,
wird man auf den Wert von der vorherigen Runde zurückgesetzt.

Implementiere nun einen automatischen Dartzähler, damit der Spieler seine Punkte nicht
selbst im Kopf rechnen muss.
 |-----------------------------------------------------------------------------------|
 */
public class Dart {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in); //Erzeuge Scanner
        int punkte = 501; //Variable "punkte" mit 501 initialisiert -->Startwert
        System.out.println("Wie viele Spieler sind Sie?");
        int anzahl = baba.nextInt();
        int[] spieler = new int[anzahl];
            //spieler zu punkte
        for (int i = 0; i < anzahl; i++) {
            spieler[i] = 501;
        }


        while (true) {
            for (int i = 0; i < anzahl; i++) {
                System.out.println("Spieler " + i + " gebe deinen ersten Wurf ein. Du hast " + spieler[i] + " Punkte.");
                int wurf = baba.nextInt(); //Setzt die Variable "wurf" auf den eingegebenen Wert (Es kann angenommen, dass nur gültige Werte eingegeben werden)
                spieler[i] = spieler[i] - wurf;
                System.out.println("Sie haben " + spieler[i] + " Punkte");

                if (spieler[i] == 0) {
                    System.out.println("Du hast Gewonnen");
                    System.exit(0);
                }

                if (wurf > 180) {
                    spieler[i] = spieler[i] + wurf;
                    System.out.println("Sie können nur maximal 180 Punkte haben! Sie haben jetzt wieder " + spieler[i] + " Punkte.");
                }

                if (punkte < 0) {
                    spieler[i] = spieler[i] + wurf;
                    System.out.println("Ihre Punktzahl wurde auf die von letzter Runde zurückgesetzt da es negativ war diese sind " + spieler[i]);
                }
            }
        }


    }
}
