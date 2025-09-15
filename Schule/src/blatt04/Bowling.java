package blatt04;
import java.util.Scanner;
public class Bowling {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        int runde = 1;
        int ergebnis = 0;

        while (runde <= 10){
            System.out.println("Wie viele Pins hast du abgeräumt");
            int pins = baba.nextInt();
            if (pins == 10){
                System.out.println("Du hast einen Strike Glückwunsch");
                System.out.println("Rechne deine nächsten beiden Würfen 2x "); //todo mach das richtig
            } else System.out.println("Du darfst noch einmal Werfen");
            System.out.println("Gebe deinen zweiten Wurf ein");
            int pins2 = baba.nextInt();
            ergebnis = pins + pins2;
            System.out.println("Du hast " + pins + " + " + pins2 + " = " + ergebnis);
        }
        System.out.println("Du hast " + ergebnis + "Punkte");
    }
}
