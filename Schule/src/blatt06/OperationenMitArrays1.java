package blatt06;
import java.util.Scanner;
public class OperationenMitArrays1 {
    public static void main(String[] args) {
        int[] auftraege = new int[]{9000, 23000, 41000, 6000, 13000, 22000, 38000, 16000, 7000, 14000, 12000, 5000, 17000};
        Scanner baba = new Scanner(System.in);
        int summe = 0;
        int zaehler = 0;

        for (int i = 0; i < auftraege.length; i++) {
             summe += auftraege[i];

            if (auftraege[i] >= 15000) {
                System.out.println("Dein Auftrag beträgt mehr oder gleich 15000 er ist " + i);
            zaehler++;
            }
        }
        System.out.println("Summe: " + summe + " €");
        System.out.println("Es sind " + zaehler + " Aufträge mit einem Wert von oder über 15000 €");

    }
}
