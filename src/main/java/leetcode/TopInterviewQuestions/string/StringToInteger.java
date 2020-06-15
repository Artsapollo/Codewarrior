package leetcode.TopInterviewQuestions.string;

public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("42")); //42
        System.out.println(myAtoi("   -42")); //-42
        System.out.println(myAtoi("4193 with words")); //4193
        System.out.println(myAtoi("words and 987")); //0
        System.out.println(myAtoi("-91283472332")); //-2147483648
        System.out.println(myAtoi("+-2")); //0
        System.out.println(myAtoi("9223372036854775808")); //2147483648
        System.out.println(myAtoi("0-1")); //0
    }

    public static int myAtoi(String str) {
        int i = 0, sign = 1, min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;

        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        if (i == str.length()) {
            return 0;
        }

        if (str.charAt(i) == '+') {
            i++;
        } else if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        long result = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result *= 10;
            result += str.charAt(i) - '0';

            if (result * sign > max) {
                return max;
            } else if (result * sign < min) {
                return min;
            }
            i++;
        }

        result *= sign;
        return (int) result;

    }
}