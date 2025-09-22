package blatt06;
import java.util.Scanner
public class Notenliste {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Wie viele Schüler haben Sie?");
        int schuelerAnzahl = baba.nextInt();

        int[] noten = new int[schuelerAnzahl];
        for (int i = 0; i < schuelerAnzahl; i++) {

        }
    }

        for (int i = 0; i <= noten.length - 1; i++) {
            System.out.println("Note von Index " + i + ": " + noten[i]);
    }
}
