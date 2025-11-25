package blatt11;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }



        public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        swap(arr, 5, 7);
        blatt07.ArbeitMitArrays.printArray(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        blatt07.ArbeitMitArrays.printArray(arr);
        blatt07.ArbeitMitArrays.istSortiert(arr);

        //O-Notation: n²
        //Aufgabe 2) e)   wenn ich sortiere kann ich auch gleich alles durchgehen mit swap da das überprüfen des arrays gefühlt genauso lange dauert nach jedem swap
    }
}
