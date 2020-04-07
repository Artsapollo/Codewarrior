package leetcode;

import java.util.Arrays;

public class GenerateStringWithCharHaveOddCounts {
    public static void main(String[] args) {
        System.out.println(generateTheString(6));
    }

    public static String generateTheString(int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');

        if (n % 2 == 0) {
            arr[n - 1] = 'f';
        }
        return new String(arr);
    }
}
