package blatt03;
import java.util.Scanner;
public class SpringImKreis {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);

        System.out.println("Gebe mir einen Radius!");
        double radius = baba.nextDouble();

        System.out.println("Nenne mir eine beliebige X Koordinate?");
        double x = baba.nextDouble();

        System.out.println("Nenne mir eine beliebige Y Koordinate?");
        double y = baba.nextDouble();

        if ((x * x + y * y) < 1) {
            System.out.println("Deine gegebener Punkt befindet sich im Einheitskreis!");
        } else if ((x * x + y * y) == 1) {
            System.out.println("Dein gegebner Punkt befindet sich genau auf dem Einheitskreis!");
        }

        if (Math.sqrt((x * x) + (y * y)) < radius) {
            System.out.println("Der Punkt befindet sich im Kreis!");
        } else if (Math.sqrt((x * x) + (y * y)) == radius) {
            System.out.println("Der Punkt befindet sich genau auf dem Kreis!");
        }
    }
}
