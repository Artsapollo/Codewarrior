package leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }

    public static int singleNumber(int[] nums) {
        int counter = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }

                if ((j == nums.length - 1) && (counter == 1)) {
                    result = nums[i];
                }
            }
            counter = 0;
        }

        return result;
    }
}
