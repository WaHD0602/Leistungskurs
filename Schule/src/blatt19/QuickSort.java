package blatt19;

public class QuickSort {

    public static int[] trennenLinks(int[] arr, int pivot) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pivot) {
                if (arr[i] < arr[pivot]) {
                    count++;
                }
            }
        }

        int[] trennen = new int[count];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pivot) {
                if (arr[i] < arr[pivot]) {
                    trennen[j] = arr[i];
                    j++;
                }
            }
        }

        return trennen;
    }

    public static int[] trennenRechts(int[] arr, int pivot) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pivot) {
                if (arr[i] >= arr[pivot]) {
                    count++;
                }
            }
        }

        int[] trennen = new int[count];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != pivot) {
                if (arr[i] >= arr[pivot]) {
                    trennen[j] = arr[i];
                    j++;
                }
            }
        }

        return trennen;
    }

    public static int[] zusammenfuegen(int[] links, int pivot, int[] rechts) {
        int[] arr = new int[links.length+rechts.length+1];

        for (int i = 0; i < arr.length; i++) {
            if (i < links.length) {
                arr[i] = links[i];
            } else if (i == links.length) {
                arr[i] = pivot;
            } else {
                arr[i] = rechts[i-links.length-1];
            }
        }

        return arr;
    }

    public static int[] quickSort(int[] arr) {
        if (arr.length > 1) {
            int pos = 0;
            int[] kUnsortiert = trennenLinks(arr, pos);
            int[] gUnsortiert = trennenRechts(arr, pos);
            int[] kSortiert = quickSort(kUnsortiert);
            int[] gSortiert = quickSort(gUnsortiert);
            int[] sortiert = zusammenfuegen(kSortiert, arr[pos], gSortiert);
            return sortiert;
        } else {
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, -2, 3, 8, 5, 6, 7, 4, 9, 10};
        int[] arr2 = quickSort(arr);
        blatt07.ArbeitMitArrays.printArray(arr2);
    }

}
