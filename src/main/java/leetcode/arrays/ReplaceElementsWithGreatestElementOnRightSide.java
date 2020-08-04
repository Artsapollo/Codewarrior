package leetcode.arrays;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
//        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr = {57010, 40840, 69871, 14425, 70605};
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
//Correct while constraint is to not create new array
    private static int[] replaceElements(int[] arr) {
        int index = 0;
        int j = arr.length - 1, max = Integer.MIN_VALUE;

        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (i == j && index != j) {
                arr[index++] = max;
                max = 0;
                i = index;
            }
        }
        arr[j] = -1;
        return arr;
    }
}
/*
Correct in other situation
        int max = -1;
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = max;
            max = Math.max(max, arr[i]);
*/