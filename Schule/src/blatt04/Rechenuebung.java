package blatt04;
import javax.lang.model.util.Elements;
import java.lang.classfile.attribute.ModuleRequireInfo;
import java.util.Scanner;
import java.util.Random;
public class Rechenuebung {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        Random random = new Random();
        int zahl1 = random.nextInt(1,25) + 1;
        int zahl2 = random.nextInt(1,25) + 1;
        double ergebnis = zahl1 * zahl2;

        while(true) {
            System.out.println("Was ist " + zahl1 + "*" + zahl2 + "?");
            double eingabe = baba.nextDouble();

            if (eingabe == ergebnis) {
                System.out.println("Richtig Super!");
                System.exit(0);
            } else {
                System.out.println("Leider falsch versuche es gerne erneut oder starte neu");
            }
            //ich habe zuerst zuffälige Zahlen generieren lassen weil ich es einfach kann und so immer neue dinge kommen. danach wird es immer wieder abgefragt ob es richtig ist wenn ja dann exit wenn nein dann neuer versuch
        }
    }
}

