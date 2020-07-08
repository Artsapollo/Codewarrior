package leetcode.TopInterviewQuestions.string;

//input 123
//output 321
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
//        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
            long result = 0;

            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;

            while (x != 0) {
                int carr = x % 10;
                result = result * 10 + carr;
                x /= 10;
            }

            return result > max || result < min ? 0 : (int) result;
    }
}
