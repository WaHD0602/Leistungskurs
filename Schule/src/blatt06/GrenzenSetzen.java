package blatt06;
import java.util.Scanner;
public class GrenzenSetzen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie eine Untergrenze ein (Ganzzahl)!");
        int untergrenze = input.nextInt();
        System.out.println("Geben Sie eine Obergrenze ein (Ganzzahl)!");
        int obergrenze = input.nextInt();

        if (untergrenze < 0 || obergrenze < 0) {
            System.out.println("Bitte keine negativen Zahlen");
            System.exit(0);
        }



        int[] zwischenWerte = new int[obergrenze + 1];

        for (int i = untergrenze; i <= obergrenze; i++) {
            zwischenWerte[i] = i;
            System.out.println(zwischenWerte[i]);
        }
    }
}
