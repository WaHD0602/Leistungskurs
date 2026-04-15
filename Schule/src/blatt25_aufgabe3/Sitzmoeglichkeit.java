package blatt25_aufgabe3;

public class Sitzmoeglichkeit {
    private int sitzplaetze;
    private int besetzt;

    public Sitzmoeglichkeit(int besetzt, int sitzplaetze) {
        this.besetzt = besetzt;
        this.sitzplaetze = sitzplaetze;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public int getBesetzt() {
        return besetzt;
    }

    public void hinsetzen() {
        if (this.besetzt < this.sitzplaetze) {
            this.besetzt++;
        } else {
            System.out.println("Sitzmoeglichkeiten ist voll");
        }
    }

    public void aufstehen() {
        this.besetzt--;
        if (this.besetzt < 0) {
            System.out.println("Keiner zum aufstehen");
            besetzt = 0;
        }
    }

}
