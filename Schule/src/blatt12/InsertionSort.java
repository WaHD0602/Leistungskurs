package blatt12;

public class InsertionSort {

    public static int[] insertionSort(int[] arr) {
        int[] arrSort = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < element) {
                    count++;
                }
            }
            arrSort[count] = element;
        }
        return arrSort;
    }

    public static void insertionSortInPlace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[arr.length - i - 1]) {

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, -3, 50, 67, 7, 6, 12, 137, -3000};
        insertionSortInPlace(arr);
    }
}
