package blatt04;

import java.util.Random;
import java.util.Scanner;

public class ETF {

    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        Random random = new Random();
        double gesamt = 0; //startgeld
        double wert = 3578.89; //wert von einem %

        int jahr = 1;
        int monat = 0;
        double anteil = 0;

        System.out.println("Wie viele Jahre möchten sie Sparen");
        int jahre = baba.nextInt(); //dauer der käufe in die aktie

        while (true) { //unendliche käufe da es ja von der spanne der zeit beendet wird

            if (jahr > jahre) {
                System.out.println("Sie haben ihre Jahres Zahl erreicht");
                System.out.println("Sie haben " + gesamt + " Gespart, in " + jahre + " Jahren."); //darstellung des geldes in der dauer
                break; //beenden wenn ich meine dauer erreicht habe
            }

            System.out.println("Wie viel möchten Sie dieses Jahr Einzahlen?");
            double sparbetrag = baba.nextInt(); //jährliche abfrage für die planung des jahres
            while (monat < 12) {
                gesamt = gesamt + sparbetrag;
                double zinssatz = random.nextDouble(1.06,1.12); //random zinssatz
                gesamt = gesamt * zinssatz;
                anteil = gesamt / wert;
                monat++;
                System.out.printf("Jahr %d,\tMonat %d,\tSparbetrag %.2f€,\tZinssatz %.2f,\tKontostand %.2f€,\t\tMSCI-Anteile %.2f%n", jahr, monat, sparbetrag, (zinssatz-1)*100, gesamt , anteil); //finale ausgabe der einnahmen in diesem jahr
            }                                                                                               //ich bin mir nicht sicher wie ich das problem mit der zeilverschiebung beheben kann
            monat = 0; //zurücksetzen der monate damit es wieder die jahre durchgehen kann
            jahr++; //damit es auch enden kann
        }
    }
}
