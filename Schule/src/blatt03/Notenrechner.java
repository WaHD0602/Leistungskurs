package blatt03;
import java.util.Scanner;
public class Notenrechner {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        double eins = 0.85; //lege überall denn Wert fest
        double zwei = 0.7;
        double drei = 0.55;
        double vier = 0.39;
        double fünf = 0.17;
        double sechs = 0;

        System.out.println("Wie viele Punkte konnte man erreichen?");
        double maximalpunkte = baba.nextDouble();

        System.out.println("Wie viele Punkte haben Sie?");
        double punktzahl = baba.nextDouble();

        if (punktzahl > maximalpunkte) {
            System.out.println("Du kannst nicht mehr Punkte haben als es Aufgaben gibt! Außer da waren Außnahmen"); //damit es nicht mehr als 100% sein können gibt natürlich außnahmen wie extra aufgaben aber so genau ist es egal
            System.exit(0);
        }

        if (punktzahl < sechs) {
            System.out.println("Du kannst nicht weniger als 0 Punkte haben!"); //so sollte ich negative zahlen auschließen
        }

        double prozent = (punktzahl / maximalpunkte); //eine kommazahl ausrechnen die mir zeigen kann wie viel prozent ich habe

        if (prozent >= eins) {
            System.out.println("Du hast eine 1 Glückwunsch!"); //frage ab welche Note er hat
            System.exit(0); //beende das programm falls es zutrifft damit er nur eine note ausgegeben bekommt
        }

        if (prozent >= zwei) {
            System.out.println("Du hast eine 2 Glückwunsch!");
            System.exit(0);
        }

        if (prozent >= drei) {
            System.out.println("Du hast eine 3 Kopf hoch!");
            System.exit(0);
        }

        if (prozent >= vier) {
            System.out.println("Du hast eine 4 nächstes mal wieder besser!");
            System.exit(0);
        }

        if (prozent >= fünf) {
            System.out.println("Du hast eine 5 mehr lernen!");
            System.exit(0);
        }

        if (prozent >= sechs) {
            System.out.println("Du hast eine 6 blöd gelaufen!");
            System.exit(0);
        }
    }
}
