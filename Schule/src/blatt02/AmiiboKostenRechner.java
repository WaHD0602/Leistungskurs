package blatt02;
import java.util.Scanner;
public class AmiiboKostenRechner {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Wie viele Amiibos möchten sie kaufen?");
        double anzahl = baba.nextDouble();
        double preis = anzahl * 15; //todo soll nicht negativ sein wegen geld geschenkt
        System.out.println("Ihr Preis beträgt " + preis + " €");
    }
}
