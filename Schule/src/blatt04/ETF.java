package blatt04;

public class ETF {
    public static void main(String[] args) {
        double wertbetrag = 50;
        double wertsteigung = 1.06;
        double wert = 3578.89;
        int jahr = 12;
        int monat = 1;
        double anteil = 0;
        while (monat < 12) {
            monat = monat + 1;
            wertbetrag = wertbetrag + 50;
            anteil = wert * wertsteigung;
        }
        System.out.println(wertbetrag);
        System.out.println(anteil);
    }
}
