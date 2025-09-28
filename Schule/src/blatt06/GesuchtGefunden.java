package blatt06;

public class GesuchtGefunden {

	public static void main(String[] args) {
		double[] arr = new double[] {3.45, 7, 14, -66, 5.4, 33.33, 99.1, 42.3, 3.14, -3.14, 13.56, 7.8031, -54.35, 6.120, 6.435, -2.30001, 0.00005, -65.78, -29.57, 92, -83, 3174.56, -1469.349, -5.086, 27.135, 348.5, 52.3568, -47.320051, 8372.579, -593.2, 0.25874, -7.1952, 3587.6, -201.3, -65.92, 12, 5, 13.7, -30, 16.5, 10071, 1700.34, -50.05, 81.3576, -42};

        double groestesElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > groestesElement) {
                groestesElement = arr[i];
            }
        }
        System.out.println("Größtes Element: " + groestesElement);

        double kleinstesElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < kleinstesElement) {
                kleinstesElement = arr[i];
            }
        }
        System.out.println("Kleinstes Element ist: " + kleinstesElement);

        double gesamt = 0;
        for (int i = 0; i < arr.length; i++) {
            gesamt += arr[i];
        }
        System.out.println("Der Gesamtwert aller Elemente der Arrays ist: " + gesamt);

        double kleinstePaardifferenz = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            double differenz = arr[i] - arr[i - 1];
            if (differenz < kleinstePaardifferenz) {
                kleinstePaardifferenz = differenz;
            }
        }

        System.out.println("Kleinste Paardifferenz: " + kleinstePaardifferenz);
    }
}
