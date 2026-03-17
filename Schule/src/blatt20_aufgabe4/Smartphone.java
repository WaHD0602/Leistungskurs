package blatt20_aufgabe4;

public class Smartphone {

    private String marke;
    private String modell;
    private int akkustand;
    private int preis;
    private int speicherplatz;
    private int freierSpeicherplatz;
    private int[] displaygroesse = new int[1];
    private int helligkeit;
    private int lautstaerke;
    private String betriebssystem;
    private boolean an;

    public Smartphone(int speicherplatz, int preis, String modell, String marke) {
        this.speicherplatz = speicherplatz;
        this.preis = preis;
        this.modell = modell;
        this.marke = marke;
        this.akkustand = 100;
    }

    public int getFreierSpeicherplatz() {
        return freierSpeicherplatz;
    }

    public void setFreierSpeicherplatz(int freierSpeicherplatz) {
        if (this.freierSpeicherplatz > speicherplatz) {
            this.freierSpeicherplatz = speicherplatz;
        } else this.freierSpeicherplatz = freierSpeicherplatz;
    }

    public int[] getDisplaygroesse() {
        return displaygroesse;
    }

    public void setDisplaygroesse(int[] displaygroesse) {
        this.displaygroesse = displaygroesse;
    }

    public int getHelligkeit() {
        return helligkeit;
    }

    public int getAkkustand() {
        return akkustand;
    }
    public void setAkkustand(int akkustand) {
        this.akkustand = Math.max(akkustand, 0);
        this.akkustand = Math.min(akkustand, 100);
    }

    public int getPreis() {
        return preis;
    }
    public void setPreis(int preis) {
        this.preis = Math.max(preis, 0);
    }

    public int getSpeicherplatz() {
        return speicherplatz;
    }
    public void setSpeicherplatz(int speicherplatz) {
        this.speicherplatz = Math.max(speicherplatz, 0);
    }

    void nutzen(int l) {
        setAkkustand(this.akkustand - l);
    }

    void laden(int l) {
        setAkkustand(this.akkustand + l);
    }

    public void speicherLeeren(int akkustand) {
        this.akkustand = 0;
    }

    public void akkuLaden(int akkustand) {
        this.akkustand = 100;
    }

    public void einschalten() {
        this.an = true;
    }

    public void istAkkuLeer(int akkustand) {
        if (this.akkustand == 0) {
            System.out.println("Akku leer");
        } else System.out.println("Akku nicht leer");
    }

    public void appInstallieren(String app, int groesse) {
        if ((this.freierSpeicherplatz + groesse) < speicherplatz) {
            System.out.println(app + " wird installiert");
        }
    }

    public void hatGenungSpeicher(int gewollterSpeicherplatz) {
        if (this.speicherplatz != gewollterSpeicherplatz) {
            this.speicherplatz = gewollterSpeicherplatz;
        }
    }

}
