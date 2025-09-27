package blatt06;

public class DasErsteArray {
    public static void main(String[] args) {
        int[] array = new int[990];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 10;
            System.out.println(array[i]);
        }

        for (int i = 989; i >= 0; i--) {
            array[i] = i + 10;
            System.out.println(array[i]);
        }
    }
}
