package leetcode;

import java.util.Arrays;

public class SumFunc {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 7, 1, 5, 8, 19, 10};
        int high = arr.length - 1;
        int low = 0;
        quick(arr, low, high);

        System.out.println(Arrays.toString(arr));
//        System.out.println(summ(arr, 0, arr.length));
//        System.out.println(biggest(arr));
//        System.out.println(binary(arr, 0, 2, 4));
    }

    public static void quick(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        int anchor = array[mid];


        int i = low;
        int j = high;

        while (i <= j) {
            while (array[i] < anchor) {
                i++;
            }
            while (array[j] > anchor) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j++;
            }
        }

        if (low < j) {
            quick(array, low, j);
        }
        if (high > i) {
            quick(array, i, high);
        }
    }

    public static int binary(int[] arr, int low, int high, int target) {
        int index = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }


    public static int biggest(int[] arr) {
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }


    public static int summ(int[] arr, int start, int finish) {
        if (start == finish - 1) {
            return arr[finish - 1];
        }
        int temp = arr[start];

        temp += summ(arr, start + 1, finish);

        return temp;
    }
}
