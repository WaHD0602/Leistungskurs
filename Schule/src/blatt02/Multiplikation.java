package blatt02;
import java.util.Scanner;
public class Multiplikation {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Nenne die erste (ganze) Zahl");
        int erste =  baba.nextInt();
        System.out.println("Nenne die zweite (ganze) Zahl");
        int zweite = baba.nextInt();
        int ergebnis = erste * zweite;
        System.out.println(erste  + " * " + zweite + " = " + ergebnis);
    }
}
