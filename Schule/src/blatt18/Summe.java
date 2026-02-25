package blatt18;

public class Summe {

    public static int rekursion(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return rekursion(n - 1) + n;
    }
    public static void main(String[] args) {
        System.out.println(rekursion(3));
    }
}
