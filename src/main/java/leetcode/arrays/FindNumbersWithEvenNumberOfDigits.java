package leetcode.arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;

        for (int i : nums) {
            if (isEven(i)) count++;
        }

        return count;
    }

    private static boolean isEven(int n) {
        int k = (int) (Math.log10(n) + 1); //Expression to get number length
        return k % 2 == 0;
    }
}
