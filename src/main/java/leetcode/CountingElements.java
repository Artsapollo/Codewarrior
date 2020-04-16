package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountingElements {
    public static void main(String[] args) {
        int[] in = new int[]{1, 1, 3, 3, 5, 5, 7, 7};
        System.out.println(countElements(in));
    }

    public static int countElements(int[] arr) {
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        for (int s : list) {
            if (list.contains(s + 1)) {
                count++;
            }
        }
        return count;
    }
}
