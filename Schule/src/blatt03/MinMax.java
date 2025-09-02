package blatt03;
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Was ist deine erste (ganze) Zahl?");
        int erste = baba.nextInt();
        System.out.println("Was ist deine zweite (ganze) Zahl?");
        int zweite = baba.nextInt();
        System.out.println("Was ist deine dritte (ganze) Zahl?");
        int dritte = baba.nextInt();

        if (erste >= zweite && erste >= dritte) {
            System.out.println(erste + " ist die größte Zahl");
        } else if (erste <= zweite && erste <=  dritte) {
                System.out.println(erste + " ist die kleinste Zahl");
        }

        if (zweite >= erste && zweite >= dritte) {
            System.out.println(zweite + " ist die größte Zahl");
        } else if (zweite <= erste && zweite <= dritte) {
            System.out.println(zweite + " ist die kleinste Zahl");
        }

        if (dritte >= erste && dritte >= erste) {
            System.out.println(dritte  + " ist die größte Zahl");
        } else if (dritte <= erste && dritte <= erste) {
            System.out.println(dritte + " ist die kleinste Zahl");
        }
    }
}
