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

    public static void print2DArray(char[][] arr) {
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

    public static char[][] createEmpty2DCharArray(int a, int b) {
        char[][] arr = new char[a][b];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }
        return arr;
    }

    public static boolean istIdentisch(char[][] arr1, char[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) {
                return false;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static char[][] copy2DCharArray(char[][] arr) {
        char[][] arr2 = arr;
        print2DArray(arr2);
        return arr2;
    }

    public static void shiftRows(int[][] arr, int reihe, int verschiebungswert) {
        if (reihe < 0 || reihe > arr.length-1) {
            System.out.println("Error, Brudi, bist du dumm?");
        } else {
            for (int i = 0; i < verschiebungswert; i++) {
                blatt07.ArbeitMitArrays.shiftLeft(arr[reihe]);
            }

        }
    }


    public static void main(String[] args) {

        int[][] arr0 = new int[][] {new int[] {3,5,6,7}, new int[] {6,7,67,4}, new int[] {9,1,2,3}, new int[] {1,2,3,4}};
        print2DArray(arr0);
        char[][] arr = createEmpty2DCharArray(5,6);
        copy2DCharArray(arr);
    }
}

