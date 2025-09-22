package blatt04;
import java.util.Scanner;
public class Bowling {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        int runde = 1;
        int ergebnis = 0;
        int multiplikator = 1;
        int pins = 0;
        int pins2 = 0;

        while (runde <= 10) {
            System.out.println("Wie viele Pins hast du abgeräumt");
            pins = baba.nextInt();
            if (pins == 10) {
                System.out.println("Du hast einen Strike Glückwunsch");
                System.out.println("Rechne deine nächsten beiden Würfen 2x"); //TODO mach das richtig
                ergebnis += 10;
                multiplikator++;
                break;
            } else {
                System.out.println("Du darfst noch einmal Werfen");
            }
            if (pins < 10) {
                System.out.println("Gebe deinen zweiten Wurf ein");
                pins2 = baba.nextInt();
                while (true) {
                    if (pins + pins2 > 10) {
                        System.out.println("Du kannst nicht mehr als Zehn Punkte haben");
                        System.out.println("Gib deinen zweiten Wurf richtig ein");
                        pins2 = baba.nextInt();
                    } else {
                        break;
                    }
                }
            }
            ergebnis = pins + pins2 * multiplikator;
            System.out.println("Du hast " + pins + " + " + pins2 + " = " + ergebnis);
            multiplikator = 1;
        }
        System.out.println("Du hast " + ergebnis + " Punkte");
    }
}
