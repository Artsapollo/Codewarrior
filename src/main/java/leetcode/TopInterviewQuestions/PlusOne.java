package leetcode.TopInterviewQuestions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 9})));
//        System.out.println(Arrays.toString(plusOne(new int[]{9})));   //              10
//        System.out.println(Arrays.toString(plusOne(new int[]{9, 9}))); //[1,0,0]  [9,9,0]
        System.out.println(Arrays.toString(plusOne(new int[]{8, 2, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] newint = new int[digits.length + 1];
            newint[0] = 1;
            return newint;
        }

        return digits;
    }
}
