package leetcode.arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
    }

    public static int heightChecker(int[] arr) {
        int[] srt = Arrays.copyOf(arr, arr.length);
        Arrays.sort(srt);

        int count = 0;
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] != srt[k]) {
                count++;
            }
        }

        return count;
    }
}
