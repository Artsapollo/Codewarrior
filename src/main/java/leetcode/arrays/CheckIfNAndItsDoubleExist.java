package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{7, 1, 14, 11}));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            if(set.contains(i * 2)) return true;
            else if (i % 2 == 0 && set.contains(i / 2)) return true;
            else set.add(i);
        }

        return false;
    }
}
