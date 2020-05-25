package leetcode.TopInterviewQuestions.string;

import java.util.Arrays;

public class ImplementStr {

    public static void main(String[] args) {
        int [] s = new int[]{1,2,3};
        System.out.println(Arrays.toString(s));
        System.out.println(strStr("aaaaabba", "ba"));
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        return haystack.indexOf(needle);
    }
}
