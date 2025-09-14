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
        int abstandAlt = Math.abs(topfX - playerX) + Math.abs(topfY - playerY);

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

            int abstandNeu = Math.abs(topfX - playerX) + Math.abs(topfY - playerY);
            //errechnung des abstands
            if (abstandAlt > abstandNeu) {
                System.out.println("Warm");
            }
            else if (abstandAlt < abstandNeu) {
                System.out.println("Kalt");
            }
            else System.out.println("Lauwarm");

            abstandAlt = abstandNeu; //reseten des abstands

            if (playerX > 5 || playerY > 5) {
                System.out.println("Gehe wieder zurück dieses Topfschlagen ist nur im 5x5");
            }
        }
        System.out.println("Du hast Gewonnen");
    }
}
