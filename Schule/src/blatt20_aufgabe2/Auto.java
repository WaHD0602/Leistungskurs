package blatt20_aufgabe2;

public class Auto {

    String marke;
    String modell;
    int tank;
    int geschwindigkeit;
    int kilometerstand;

    public Auto() {
        marke = "unbekannt";
        modell = "unbekannt";
        tank = 50;
        geschwindigkeit = 0;
        kilometerstand = 0;
    }

    public Auto(String marke, String modell, int tank, int geschwindigkeit, int kilometerstand) {
        this.marke = marke;
        this.modell = modell;
        this.tank = tank;
        this.geschwindigkeit = geschwindigkeit;
        this.kilometerstand = kilometerstand;
    }

    Auto a1 = new Auto("BMW", "M3", 60, 0, 120000);

    public Auto(Auto a) {
        this.marke = a.marke;
        this.modell = a.modell;
        this.tank = a.tank;
        this.kilometerstand = a.kilometerstand;
        this.geschwindigkeit = a.geschwindigkeit;
    }

    Auto a2 = new Auto(a1);

    public void beschleunigen(int v) {
        this.geschwindigkeit = v;
    }

    public void bremsen(int v) {
        this.geschwindigkeit = v;
    }

    public void fahren(int km) {
        this.kilometerstand = this.kilometerstand + km;
    }

    public static void main(String[] args) {

    }
}
