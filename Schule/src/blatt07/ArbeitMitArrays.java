package blatt07;

public class ArbeitMitArrays {

    /**
     * Eine Array ausgabe die jeden Wert des arrays unsortiert ausgibt für int
     * @param array
     */
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print(" ]\n");
    }

    /**
     * Eine Array ausgabe die jeden Wert des arrays unsortiert ausgibt für double
     * @param array
     */
    public static void printArray(double[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print(" ]\n");
    }

    /**
     * Eine Array ausgabe die jeden Wert des arrays unsortiert ausgibt für boolean
     * @param array
     */
    public static void printArray(boolean[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print(" ]\n");
    }

    /**
     * Eine Array ausgabe die jeden Wert des arrays unsortiert ausgibt für char
     * @param array
     */
    public static void printArray(char[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print(" ]\n");
    }

    /**
     * Eine Array ausgabe die jeden Wert des arrays unsortiert ausgibt für string
     * @param array
     */
    public static void printArray(String[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.print(" ] \n");
    }

    /**
     * Guckt nach ob es Sortiert ist und gibt true und false entsprechend sortiert aus
     * @param array
     * @return
     */
    public static boolean istSortiert(int[] array) {
        boolean sortiert = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sortiert = false;
                System.out.println(sortiert);
                return sortiert;
            }
        }
        if (sortiert == true) {
            System.out.println(sortiert);
        }
        return sortiert;
    }

    /**
     * addieren ist eine funktion wo zwei int arrays addiert werden und di länge ausgerechnet wird. anschließend wird durch printarray das ergebnis geprintet
     * @param array1
     * @param array2
     * @return
     */
    public static int[] addieren(int[] array1, int[] array2) {
        if (array1.length < array2.length) {
            int[] tausch = array1;
            array1 = array2;
            array2 = tausch;
        }

        int[] ergebnis = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            ergebnis[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            ergebnis[j] = ergebnis[j] + array2[j];
        }
        printArray(ergebnis);
        return ergebnis;
    }

    public static void shiftLeft(int[] arrint) {
        for (int i = 0; i < arrint .length; i++) {
            arrint
        }
    }

    public static void main(String[] args) {

        String[] test = {"Schisch", "Mämpel", "Klupsch" };
        double[] test2 = {1.0, 2.0, 3.0, 4.0};
        boolean[] test3 = {true, true, true, true, true};
        char[] test4 = {'A', 'B', 'C', 'D'};
        int[] test5 = {1, 2, 3, 4};
        int[] test6 = {1, 2, 3, 4 , 5};
        addieren(test5, test6);
    }
}