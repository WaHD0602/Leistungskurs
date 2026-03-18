package blatt20_aufgabe5;

public class Benutzerkonto {
    private String benutzername;
    private String email;
    private String geburtsdatum;
    private String passwort;
    private int guthaben;
    private String kontoErstellungsdatum;
    private String gutscheincode;
    private int gutschein;
    private String meinGutscheincode;

    public Benutzerkonto(String benutzername, String email, String geburtsdatum, String passwort, String gutscheincode, int gutschein, String kontoErstellungsdatum,  String meinGutscheincode) {
        this.benutzername = benutzername;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.passwort = passwort;
        this.gutscheincode = gutscheincode; //nicht fuer nutzer sichtbar
        this.gutschein = 15;
        this.kontoErstellungsdatum = kontoErstellungsdatum;
        this.meinGutscheincode = meinGutscheincode; //sichtbar
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void anmelden(String benutzername, String email, String passwort) {
        if (benutzername.equals(this.benutzername) || email.equals(this.email) && passwort.equals(this.passwort)) {
            System.out.println("angemeldet");
        } else System.out.println("Passwort oder der angegebene Benutzername ist falsch!");
    }

    public void passwortändern(String neuPasswort, String passwort, String benutzername, String email) {
        if (benutzername.equals(this.benutzername) || email.equals(this.email) && passwort.equals(this.passwort)) {
            if (this.passwort == passwort) {
                this.passwort = neuPasswort;
            } else System.out.println("Passwort ist nicht passwort!");
        } else System.out.println("Falsche Daten zur anmeldung");
    }

    public void gutscheinEinloesen(String meinGutscheincode, String benutzername, String email, String passwort) {
        if (benutzername.equals(this.benutzername) || email.equals(this.email) && passwort.equals(this.passwort)) {
            if (this.gutscheincode.equals(meinGutscheincode)) {
                this.guthaben += gutschein;
            }
        }
    }


    public void guthabenAnzeigen() {
        System.out.println(this.guthaben);
    }
}
