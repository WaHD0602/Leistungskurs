package blatt02;
import java.util.Scanner;
public class Zinssatz {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Was ist ihr Kapital?");
        double kapital = baba.nextDouble();
        System.out.println("Was ist ihr Zinssatz?"); //Todo man muss ja nichts ändern außer den wert von kapital und zinssatz und diesem mit einer Scanner abfrage zu erstetzen
        double zinssatz = baba.nextDouble();
        double zinsen = kapital * zinssatz / 100;
        double neuesKapital = kapital + zinsen;
        System.out.println("Altes Kapital: " + kapital + "€\n" + "Zinssatz: " + zinssatz  + "%" + "\n\n" + "Zinsen: " + zinsen + "€\n" + "Neues Kapital: " + neuesKapital + "€");
    }
}
