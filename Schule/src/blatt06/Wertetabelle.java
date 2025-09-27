package blatt06;
import java.util.Scanner;
public class  Wertetabelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //baba ist besserer name
        int y = 0;
        int x = -2;
        int zwischenergebnis = 0;

        int grad = sc.nextInt();

        double[] coeff = new  double[]{grad + 1};
        for (int i = 0; i < coeff.length; i++) {
            coeff[i] = sc.nextDouble();
        }


    }
}
