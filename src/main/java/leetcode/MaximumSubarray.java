package leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr)); //Output: 6
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) { //Basic case
            return 0;
        }

        int prev = nums[0];
        int cur = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prev > 0) {
                cur = prev + nums[i];
            } else {
                cur = nums[i];
            }
            max = Math.max(max, cur);
            prev = cur;
        }

        return max;
    }
}
