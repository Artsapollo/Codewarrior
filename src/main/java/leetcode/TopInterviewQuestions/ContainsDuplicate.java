package leetcode.TopInterviewQuestions;

import java.util.Arrays;

/*
Your function should return true if any value appears at least twice in the array,
and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
//        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); //true
//        System.out.println(containsDuplicate(new int[]{1, 3, 4, 2})); //false
        System.out.println(containsDuplicate(new int[]{1, 3, 4, 1})); //true
    }

    private static boolean containsDuplicate(int[] nums) {
        int index = 0;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
            } else {
                return true;
            }
        }
        return false;
    }


}
