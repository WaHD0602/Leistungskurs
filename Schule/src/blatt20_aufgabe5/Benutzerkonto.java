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

    public Benutzerkonto(String benutzername, String email, String geburtsdatum, String passwort) {
        this.benutzername = benutzername;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.passwort = passwort;
    }

    public void anmelden() {
        if (benutzername.equals(this.benutzername) || email.equals(this.email) && passwort.equals(this.passwort)) {
            System.out.println("angemeldet");
        } else System.out.println("Passwort oder der angegebene Benutzername ist falsch!");
    }

    public void passwortändern(String neuPasswort) {
        if (this.passwort == passwort) {
            this.passwort = neuPasswort;
        } else System.out.println("Passwort ist nicht passwort!");
    }

    public void gutscheinEinloesen(String meinGutscheincode) {
        if (gutscheincode.equals(this.gutschein)) {
            this.guthaben += gutschein;
        }
    }

    public void guthabenAnzeigen() {
        System.out.println(this.guthaben);
    }


}
