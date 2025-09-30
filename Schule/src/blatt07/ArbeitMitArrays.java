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

    public static void main(String[] args) {

        String[] test = {"Schisch", "Mämpel", "Klupsch" };
        double[] test2 = {1.0, 2.0, 3.0, 4.0};
        boolean[] test3 = {true, true, true, true, true};
        char[] test4 = {'A', 'B', 'C', 'D'};
        printArray(test);
        printArray(test2);
        printArray(test3);
        printArray(test4);
    }
}