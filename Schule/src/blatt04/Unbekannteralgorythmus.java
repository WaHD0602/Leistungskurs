package blatt04;
import java.util.Scanner;
public class Unbekannteralgorythmus {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Geben Sie ihren A wert ein");
        int a = baba.nextInt();
        System.out.println("Geben Sie ihren B wert ein");
        int b = baba.nextInt();

        while (true) {
            if (a == b) {
                System.out.println("Ihre Werte sind gleich nämlich " + a);
                System.exit(0);
            } else  {
                if (a <= b) {
                    int h = a;
                    a = b;
                    b = h;
                }
                a = a-b;
            }
        }
    }
}
