package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        check(list);
    }

    public static void check(List<List<Integer>> list){
        list.add(Arrays.asList(3));
    }
}