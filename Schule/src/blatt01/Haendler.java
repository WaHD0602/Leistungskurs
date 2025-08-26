package blatt01;

public class Haendler {
    public static void main(String[] args) {
        int anzahlNormal = 9;
        int anzahlMini = 5;
        int anzahlMicro = 0;
        double normalsd = 5;
        double minisd = 8;
        double microsd = 12;
        double preis = anzahlNormal * normalsd + anzahlMini * minisd + anzahlMicro * microsd;
        System.out.println("Der Preis für... \n" + anzahlNormal  + " normale SD-Karten \n" + anzahlMini + " MiniSD-Karten \n" + anzahlMicro + " MicorSD-Karten\n... lautet " + preis + "€");

    }
}
