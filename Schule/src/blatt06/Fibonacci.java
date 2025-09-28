package blatt06;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Länge des Fibonacci-Arrays ein: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Dein n muss mindestens 2 sein");
            return;
        }

        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("Fibonacci-Zahlen: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        double quotient = (double) fibonacci[n - 1] / fibonacci[n - 2];
        System.out.printf("%nQuotient f(n)/f(n-1): %.10f%n", quotient);

        //c) hab ich keine ahnung
    }
}
