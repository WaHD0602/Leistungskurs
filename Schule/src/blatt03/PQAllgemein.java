package blatt03;

import  java.util.Scanner;

public class PQAllgemein {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie die Variablen a, b, c und d ein:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        //Alle Variablen für die quadratische Gleichung zum eingeben

        System.out.println("Deine quadratische Gleichung ist: " + a + " * " + " (x * x) " + " + " + b + " * "  +  " x "  + " + " + c + " = " + d);
        //Gibt die quadratische Gleichung an

        System.out.println("Die allgemeine quadratische Gleichung lautet: " + a + " (x * x) " + b + " * " + " x " + (c - d) + " = " + 0);
        //Gibt die quadratische Formel = 0 an

        double p = b;
        double q = (c - d);
        //stumpfes ablesen der gleichung um auf diese Werte von p und q zu kommen

        System.out.println("Die Variable P ist: " + p);
        System.out.println("Die Variable Q ist: " + q);


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
        double x2 = -p / 2 - Math.sqrt(dis);
        //Hier wurden einfach die verschiedenen möglichen Lösungen ausgerechnet

        if (x1 == x2) {
            System.out.printf("Es gibt nur eine Lösung die ist %.2f!" , x1);
        } else {
            System.out.printf("Es gibt zwei Lösungen nämlich ist X1 = %.2f und X2 ist = %.2f!" , x1 , x2);
            //Es werden die Zwei verschiedenen Möglichkeiten geprüft und so das passende gerundet ausgegeben
        }

    }

}
