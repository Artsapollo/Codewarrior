package leetcode.TopInterviewQuestions;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
//        int[] nums1 = new int[]{4, 9, 5}, nums2 = new int[]{9, 4, 9, 8, 4};
//        int[] nums1 = new int[]{1, 2, 2, 1}, nums2 = new int[]{2, 2};
        int[] nums1 = new int[]{6}, nums2 = new int[]{6, 6, 4, 4, 0, 0, 8, 1, 2};

        int[] result = intersect(nums2, nums1);

        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.merge(i, 1, Integer::sum);
        }

        List<Integer> list = new ArrayList<>();
        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                list.add(j);
                map.merge(j, -1, Integer::sum);
            }
        }

        int[] array = new int[list.size()];
        for (int k = 0; k < array.length; k++) {
            array[k] = list.get(k);
        }

        return array;
    }
}
