package leetcode.arrays;

public class MostConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, cur = 0;

        for (int i : nums) {
            if (i == 1) {
                cur++;
                if (cur > result)
                    result = cur;
            } else {
                cur = 0;
            }
        }

        return result;
    }
}
