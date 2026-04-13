package blatt23_aufgabe1;


public class HP_Drucker {
    private int papier;
    private boolean farbe;
    private double tintenpatronenFuellstand;
    private boolean internet;

    public enum Verbindungsmodi {
        Offline,
        Online,
        Lokal;
    }
    public enum Modi {
        Standby,
        Fehlermodus,
        geoeffnetenWartungsmodus;
    }



}
