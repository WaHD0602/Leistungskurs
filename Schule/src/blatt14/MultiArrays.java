package blatt14;

public class MultiArrays {


    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            blatt07.ArbeitMitArrays.printArray(arr[i]);
        }
    }

    public static void print2DArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            blatt07.ArbeitMitArrays.printArray(arr[i]);
        }
    }

    public static int[][] createRandom2DIntArray(int a, int b, int p, int q) {
        if (a <= 0 || b<= 0) {
            return null;
        } else {
            int[][] arr = new int[a][b];
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = blatt13.Zufall.zufallGanz(p, q);
                }
            }
            return arr;
        }
    }

    public static double[][] createRandom2DDoubleArray(int a, int b, int p, int q) {
        if (a <= 0 || b<= 0) {
            return null;
        } else {
            double[][] arr = new double[a][b];
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = blatt13.Zufall.zufall(p, q);
                }
            }
            return arr;
        }
    }




    public static void main(String[] args) {
        int[][] arr = new int[][] {new int[] {3,5,6,7}, new int[] {6,7,67,4}, new int[] {9,1,2,3}, new int[] {1,2,3,4}};
        print2DArray(arr);
    }
}

