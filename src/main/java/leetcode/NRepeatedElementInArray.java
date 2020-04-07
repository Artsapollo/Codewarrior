package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NRepeatedElementInArray {
    private static Map<Integer, Integer> how = new HashMap<>();

    public static void main(String[] args) {
//        int matrix[] = new int[]{1, 2, 3, 3};
//        int matrix[] = new int[]{2, 1, 2, 5, 3, 2};
//        int matrix[] = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        int matrix[] = new int[]{2, 6, 2, 1};
        System.out.println(repeatedNTimes(matrix));
    }

    private static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int n : A) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
        }

        return -1;
    }
}
