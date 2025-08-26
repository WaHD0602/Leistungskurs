package blatt01;

public class Zinssatz {
    public static void main(String[] args) {
        double kapital = 1220.0;
        double zinssatz = 2.25;
        double zinsen = kapital * zinssatz / 100;
        double neuesKapital = kapital + zinsen;
        System.out.println("Altes Kapital: " + kapital + "\n" + "€Zinssatz: " + zinssatz  + "%" + "\n\n" + "Zinsen: " + zinsen + "€\n" + "Neues Kapital: " + neuesKapital + "€");
    }
}
