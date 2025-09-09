package blatt04;
import java.util.Random;
public class ETF {

    public static void main(String[] args) {
        Random random = new Random();
        double gesamt = 0;
        double wert = 3578.89;

        double sparbetrag = 50;

        int jahr = 1;
        int monat = 0;

        double anteil = 0;

        while (jahr < 5) {
            while (monat < 12) {
                gesamt = gesamt + sparbetrag;
                double zinssatz = random.nextDouble(1.06,1.12);
                gesamt = gesamt * zinssatz;

                anteil = gesamt / wert;


                monat++;

                System.out.printf("Jahr %d, Monat %d, Sparbetrag %.2f, Zinssatz %.2f, Kontostand %.2f, MSCI-Anteile %.2f%n", jahr, monat, sparbetrag, (zinssatz-1)*100, gesamt , anteil);


            }
            monat = 0;
            jahr++;
        }

    }
}
