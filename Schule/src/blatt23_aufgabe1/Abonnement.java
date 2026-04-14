package blatt23_aufgabe1;

public enum Abonnement {
    EXTRASMALL(0.99, 10),
    SMALL(3.99,50),
    MEDIUM(5.99,100),
    LARGE(11.99,300),
    EXTRALARGE(24.99,700);

    final double preis;
    final int kontigent;

    Abonnement(double preis, int kontigent) {
        this.preis = preis;
        this.kontigent = kontigent;
    }
}
