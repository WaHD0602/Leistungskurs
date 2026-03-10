package blatt20_aufgabe0;

public class Fahrrad {
    String marke;
    String typ;
    String reflektoren;
    String farbton;
    int reifendurchmesser;
    String zulassung;
    boolean rueckenlicht;
    int gang;

    public void beschleunigen(int k) {
        int count;
        int geschwindigkeit;
        System.out.println("Schn");
        for (int i = 0; i <= k; i++) {
            System.out.println("e");
        }
    }

    public void beschreibung() {
        System.out.println("Fahhrad" + this.farbton + ", " + this.marke + ", " + this.gang + "Gänge, " + this.reifendurchmesser + "cm, " + this.reflektoren + ", " + this.typ + ", " + this.zulassung + ", " + this.rueckenlicht);
    }

    public void klingeln() {
        System.out.println("klingeln");
    }

    public void fahren() {
        System.out.println("Fahrrad bewegt sich");
    }

    public void schalten() {
        System.out.println("Gang noch oben oder nach unten");
    }

    public void bremsen() {
        System.out.println("Fahrrad bremst");
    }



    public void beschreiben() {

    }


    public static void main(String[] args) {


    }
}
