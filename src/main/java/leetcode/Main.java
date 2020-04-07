package leetcode;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 2, 10};
        int[] sorted = selectionSort(array);
        System.out.println();
    }

    public static int[] selectionSort(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int smallie = smallest(arr);
            res[i] = smallie;
        }
        return res;
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}