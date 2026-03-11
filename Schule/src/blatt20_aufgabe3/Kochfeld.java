package blatt20_aufgabe3;

public class Kochfeld {

    String groeße;
    int hitzestufe;

    public void waermer() {
        if (hitzestufe != 6) {
            this.hitzestufe++;
        }
    }

    public void kaelter() {
        if (hitzestufe != 0) {
            this.hitzestufe--;
        }
    }



}
