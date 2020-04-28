package leetcode.TopInterviewQuestions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 9})));
//        System.out.println(Arrays.toString(plusOne(new int[]{9})));   //              10
//        System.out.println(Arrays.toString(plusOne(new int[]{9, 9}))); //[1,0,0]  [9,9,0]
        System.out.println(Arrays.toString(plusOne(new int[]{8, 2, 9, 9})));
    }
/*
Не надо собирать число в переменную. Нужно работать с отдельными значениями. Добавил единицу, проверил предидущее
и тоже инкрементировал если надо
 */
    public static int[] plusOne(int[] digits) {
        int length = digits.length - 1;
        int plus = digits[length] + 1;
//        int[] arr = new int[digits.length + 1];

        if (plus > 9) {
            while(digits[length] == 9){
                digits[length] += 1;
                length--;
            }



//            for (int i = 0; i < digits.length - 1; i++) {
//                arr[i] = digits[i];
//            }
//
//            arr[arr.length - 2] = plus / 10;
//            arr[arr.length - 1] = plus % 10;
//            return arr;
        } else {
            digits[length] = plus;
        }
        return digits;
    }
}
/*
        int length = digits.length - 1;
        int plus = digits[length] + 1;

        if (plus > 9) {
            int[] arr = new int[digits.length + 1];
            for (int i = 0; i < digits.length - 1; i++) {
                arr[i] = digits[i];
            }
            arr[arr.length - 2] = plus / 10;
            arr[arr.length - 1] = plus % 10;
            return arr;
        } else {
            digits[length] = plus;
        }
        return digits;
 */
/*
Доставая число как целое

        int length = digits.length - 1;
        long numbers = 0;
        int i = 0;

        while (i <= length) {
            numbers = numbers * 10 + digits[i];
            i++;
        }

        int len = (int) (Math.log10(numbers += 1) + 1);
        int[] arr = new int[len];

        while (numbers != 0) {
            long g = numbers % 10;
            arr[--len] = (int) g;
            numbers /= 10;
        }

        return arr;
 */