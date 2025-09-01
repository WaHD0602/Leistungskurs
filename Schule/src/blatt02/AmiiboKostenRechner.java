package blatt02;
import java.util.Scanner;
public class AmiiboKostenRechner {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Wie viele Amiibos möchten sie kaufen?");
        double anzahl = baba.nextDouble();
        double preis = anzahl * 15; //todo das einzige was ich mir denken kann das man nicht *15 macht sondern irgendwas anderes sonst keine ahnung
        System.out.println("Ihr Preis beträgt " + preis + " €");
    }
}
