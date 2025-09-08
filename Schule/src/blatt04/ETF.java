package blatt04;

import java.util.Scanner;

public class ETF {

    public static void main(String[] args) {

        double sparbetrag = 50;
        double wertsteigung = 1.06;
        double wert =  3578.89;
        int monat = 0;

        while(monat <= 12){
            double neuerWert = wertsteigung * sparbetrag;
            monat = monat + 1;


        }

    }

}
