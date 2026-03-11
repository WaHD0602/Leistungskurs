package blatt20_aufgabe3;

public class Ofen {

    String modus;
    int temperatur;

    public void modiWechseln (String modi) {
        String erster = "Aus";
        String zweiter = "Beleuchtung";
        String dritter = "Unterhitze";
        String vierter = "Oberhitze";
        String fuenfter = "Unter- Oberhitze";
        String sechster = "Umluft";

        while (!(modus.equals(modi))) {
            if (modi.equals(zweiter)) {
                modus = modi;
            }
        }
    }
}
