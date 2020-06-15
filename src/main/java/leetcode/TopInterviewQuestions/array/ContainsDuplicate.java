package leetcode.TopInterviewQuestions.array;

import java.util.HashSet;
import java.util.Set;

/*
Your function should return true if any value appears at least twice in the array,
and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); //true
        System.out.println(containsDuplicate(new int[]{1, 3, 4, 2})); //false
        System.out.println(containsDuplicate(new int[]{1, 3, 4, 1})); //true
    }

    private static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length < 2) return false;

        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            if(set.contains(i)){
                return true;
            } else {
                set.add(i);
            }
        }

        return false;
    }


}











/*
      if(nums == null || nums.length < 2) return false;

        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            if(set.contains(i)){
                return true;
            } else {
                set.add(i);
            }
        }

        return false;
 */