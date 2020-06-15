package leetcode.TopInterviewQuestions.array;

//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
    }

    public static int singleNumber(int[] nums) {
        int index = nums[0];
        for (int i = 1; i < nums.length; i++) {
            index = index ^ nums[i];
        }
        return 0;
    }
}
























/*
  int index = nums[0];
        for (int i = 1; i < nums.length; i++) {
            index = index ^ nums[i];
        }
        return index;
 */