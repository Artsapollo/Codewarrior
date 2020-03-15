package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1
 */
public class SingleNumber3 {
    public static void main(String[] args) {
        int[] out = singleNumber(new int[]{2, 2, 1});

        for (Integer i : out) {
            System.out.println(i);
        }
    }

    public static int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (set.contains(number)) {
                set.remove(number);
            } else {
                set.add(number);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}