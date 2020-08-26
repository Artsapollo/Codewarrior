package leetcode.arrays;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void duplicateZeros(int[] arr) {
        int psbl = 0;
        int lngth = arr.length - 1;

        for (int i = 0; i <= lngth - psbl; i++) {
            if (arr[i] == 0) {
                if (i == lngth - psbl) {
                    arr[lngth] = 0;
                    lngth -= 1;
                    break;
                }
                psbl++;
            }
        }


        for (int i = lngth - psbl; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + psbl] = 0;
                psbl--;
                arr[i + psbl] = 0;
            } else {
                arr[i + psbl] = arr[i];
            }
        }
    }
}
