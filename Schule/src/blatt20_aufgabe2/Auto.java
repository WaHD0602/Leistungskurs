package blatt20_aufgabe2;

public class Auto {

    private String marke;
    private String modell;
    private int tank;
    private int geschwindigkeit;
    private int kilometerstand;

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
        if (tank < 0) {
            this.tank = 0;
        } if (tank > 100) {
            this.tank = 100;
        }
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
        if (geschwindigkeit < 0) {
            this.geschwindigkeit = 0;
        } if (geschwindigkeit > 300) {
            this.geschwindigkeit = 300;
        }
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
        if (kilometerstand < 0) {
            this.kilometerstand = 0;
        }
    }



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
