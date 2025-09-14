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
            } else if (abstandAlt < abstandNeu) {
                System.out.println("Kalt");
            } else System.out.println("Lauwarm");

            System.out.println("Du befindest dich auf (" + playerX + "|" + playerY + ")");

            abstandAlt = abstandNeu; //reseten des abstands

            if (playerX < 0) {
                System.out.println("Du kannst das 5x5 Grid nicht verlassen! Du wurdest wieder auf deine Alte Position zurückgesetzt.");
                playerX = 0;
            } else if (playerX > 5) {
                System.out.println("Du kannst das 5x5 Grid nicht verlassen! Du wurdest wieder auf deine Alte Position zurückgesetzt.");
                playerX = 5;
            }
            //ich frage ob auf welcher seite x raus geht um ihn so richtig zurückzusetzen

            if (playerY < 0) {
                System.out.println("Du kannst das 5x5 Grid nicht verlassen! Du wurdest wieder auf deine Alte Position zurückgesetzt.");
                playerY = 0;
            } else if (playerY > 5) {
                System.out.println("Du kannst das 5x5 Grid nicht verlassen! Du wurdest wieder auf deine Alte Position zurückgesetzt.");
                playerY = 5;
            }
        }
        System.out.println("Du hast Gewonnen");
    }
}