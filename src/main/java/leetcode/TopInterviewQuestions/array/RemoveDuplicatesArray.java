package leetcode.TopInterviewQuestions.array;

/*
Given a sorted array nums, remove the duplicates in-place such that each element
appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the
input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesArray {
    public static void main(String[] args) {
//        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));

    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }

        return index;
    }
}
