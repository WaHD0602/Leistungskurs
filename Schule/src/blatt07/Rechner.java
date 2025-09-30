package blatt07;

public class Rechner {
    /**
     * Addierung von a und b in einer Funktion
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Summe und zurückgabe
     */
    public static double add (double a, double b) {
        return a + b;
    }

    /**
     * Eine Rechnung von a - b in form einer Funktion
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Die Differenz und zurückgabe
     */
    public static double sub (double a, double b) {
        return a - b;
    }

    /**
     * Eine Rechnung von a * b in form einer Funktion
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Das produkt und die zurückgabe
     */
    public static double mult (double a, double b) {
        return a * b;
    }

    /**
     * Eine Rechnung von a / b in form einer Funktion
     * @param a Zahl 1
     * @param b Zahl 2
     * @return Der quotient und die zurückgabe
     */
    public static double div (double a, double b) {
        return a / b;
    }

    /**
     * Eine Rechnung von den verschieden Ergebnisen der rechnungsmöglichkeiten in form einer Methode
     * @param a Zahl 1
     * @param b Zahl 2
     * Zeile 1 ist die Summe
     * Zeile 2 ist die Differenz
     * Zeile 3 ist das Produkt
     * Zeile 4 ist das Quotient
     */
    public static void rechnung (double a, double b) {
        System.out.println("Summe: " + add(a, b));
        System.out.println("Differenz: " + sub(a, b));
        System.out.println("Produkt: " + mult(a, b));
        System.out.println("Quotient: " + div(a, b));
    }

    public static void main(String[] args) {

    }
}
