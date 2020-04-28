package leetcode.TopInterviewQuestions;

//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }

    public static int singleNumber(int[] nums) {
        int count = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

                if (count == 1) {
                    result = nums[i];
                }
            }
            count = 0;
        }
        return result;
    }
}