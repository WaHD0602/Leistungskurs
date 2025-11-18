package blatt13;


public class Zufall {

    public static double zufall(int b) {
        return Math.random() * b;
    }

    public static int zufallGanz(int b) {
        return (int)(Math.random() * (b+1));
    }

    public static double zufall(int a, int b) {
        return (Math.random() + a) * b;
    }

    public static int zufallGanz(int a, int b) {
        return (int)((Math.random() + a) * (b+1));
    }

    public static int[] zufallArray (int l, int a, int b) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = zufallGanz(a,b);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
