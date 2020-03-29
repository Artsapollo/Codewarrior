package leetcode;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reversTheString("Hello world!"));
    }

    static String reversTheString(String s) {
        char[] array = s.toCharArray();

        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = (char) temp;
            i++;
            j--;
        }

        return Arrays.toString(array).replaceAll(", ", "");
    }
}

/*
Не бест пректис

 static String reversTheString(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        return sb.toString();
    }

 */
