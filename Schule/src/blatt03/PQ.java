package blatt03;

import javax.lang.model.element.UnknownAnnotationValueException;
import java.util.Scanner;

public class PQ {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie ihre P Zahl ein");
        double p = input.nextDouble();

        System.out.println("Geben Sie ihre Q Zahl ein");
        double q = input.nextDouble();

        double dis = ((p / 2 * p / 2) - q);
        if (dis < 0) {
            System.out.println("Dein Ergebnis ist leider nicht Errechenbar da die Diskriminante negativ ist!");
            System.exit(0);
        }
        // Die Diskriminante wird als eigene Variable gespeichert um eine Kurze Nachricht an den Nutzer zu schicken und das Programm zu beenden falls diese kleiner als 0 ist

        if (Math.sqrt( (p / 2 * p / 2) - q ) < 0 ) {
            System.out.println("Das Ergebnis kann nicht errechnet werden, da die Zahl unter der Wurzel negativ ist.");
        }

        double x1 = -p / 2 + Math.sqrt(dis);
        double x2 = -p / 2 - Math.sqrt(dis); //Hier wurden einfach die verschiedenen möglichen Lösungen ausgerechnet

        if (x1 == x2) {
            System.out.printf("Es gibt nur eine Lösung die ist %.2f!" , x1);
        } else {
            System.out.printf("Es gibt zwei Lösungen nämlich ist X1 = %.2f und X2 ist = %.2f!" , x1 , x2); //Es werden die Zwei verschiedenen Möglichkeiten geprüft und so das passende gerundet ausgegeben
        }

    }

}
