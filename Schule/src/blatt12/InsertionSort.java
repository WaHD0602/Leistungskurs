package blatt12;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int[] arrSort = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            arrSort[i] = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arrSort[j + 1]) {
                    count++;
                }
            }
            arrSort[count] = arr[i];
        }
        blatt07.ArbeitMitArrays.printArray(arr);
        return arrSort;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, -3, 50, 67, 7, 6, 12, 137, -3000};
        insertionSort(arr);
    }
}
