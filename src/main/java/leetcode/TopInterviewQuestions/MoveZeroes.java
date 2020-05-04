package leetcode.TopInterviewQuestions;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order
of the non-zero elements.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

 */
public class MoveZeroes {
    public static void main(String[] args) {
//        int[] nums = new int[]{0, 0, 1};
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void moveZeroes(int[] nums) {
        int index = 0, temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
}
