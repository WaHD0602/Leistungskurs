package blatt04;
import java.util.Scanner;
import java.util.Random;

public class Topfschlagen {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        Random random = new Random();
        int topfX = new Random().nextInt(5) + 1;
        int topfY = new Random().nextInt(5) + 1;
        int playerX = 3;
        int playerY = 3;
        int abstandAlt = topfX - playerX + topfY - playerY;

        while (true) {
            if (topfX == playerX && topfY == playerY) {
                break;
            }
            System.out.println("Wohin möchtest du gehen steuere mt WASD");
            char steuerung = baba.next().toUpperCase().charAt(0);
            if (steuerung == 'W') {
                playerY = playerY + 1;
            }
            if (steuerung == 'S') {
                playerY = playerY - 1;
            }
            if (steuerung == 'A') {
                playerX = playerX - 1;
            }
            if (steuerung == 'D') {
                playerX = playerX + 1;
            }

            int abstandNeu = topfX - playerX + topfY - playerY;

            if (abstandAlt > abstandNeu) {
                System.out.println("Warm");
            }
            else if (abstandAlt < abstandNeu) {
                System.out.println("Kalt");
            }
            else System.out.println("Lauwarm");

            abstandNeu = abstandAlt;
            System.out.println(topfX + " " + topfY + " " + playerX + " " + playerY);

            // if ich brauche einen alten und neuen abstand um näher zu kommen um warm oder kalt auszugeben
            // berechne und vergleiche alten Abstand vs neuen Abstand. kleiner => wärmer; größer => kälter
        }

        System.out.println("Du hast Gewonnen");
    }
}
