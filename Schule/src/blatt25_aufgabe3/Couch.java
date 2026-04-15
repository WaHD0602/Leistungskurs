package blatt25_aufgabe3;

public class Couch extends Sitzmoeglichkeit {
    private boolean eckcouch;


    public Couch(int sitzplaetze, boolean eckcouch) {
        super(0, sitzplaetze);

        if (this.getSitzplaetze() >= 3 && eckcouch == true) {
            this.eckcouch = true;
        } else {
            this.eckcouch = false;
        }

    }
}
