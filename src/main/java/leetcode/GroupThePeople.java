package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
There are n people whose IDs go from 0 to n - 1 and each person belongs exactly to one group.
Given the array groupSizes of length n telling the group size each person belongs to,
return the groups there are and the people's IDs each group includes.

You can return any solution in any order and the same applies for IDs.
Also, it is guaranteed that there exists at least one solution.

Example 1:
Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation:
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 */
public class GroupThePeople {
    public static void main(String[] args) {
        int[] groupSizes = new int[]{3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> result = groupThePeople(groupSizes);
    }

    public static List<List<Integer>> groupThePeople(int[] groupSize) {
        List<List<Integer>> groups = new ArrayList<>();
        Map<Integer, List<Integer>> counts = new HashMap<>();

        for (int i = 0; i < groupSize.length; i++) {
            if (counts.containsKey(groupSize[i])) {
                counts.get(groupSize[i]).add(i);
            } else {
                ArrayList<Integer> group = new ArrayList<>();
                group.add(i);
                counts.put(groupSize[i], group);
            }
            if (counts.get(groupSize[i]).size() == groupSize[i]) {
                groups.add(counts.get(groupSize[i]));
                counts.remove(groupSize[i]);
            }
        }
        return groups;
    }
}
/*
 List<List<Integer>> groups = new ArrayList<>();
        Map<Integer, List<Integer>> counts = new HashMap<>();
        for (int i = 0; i < groupSize.length; i++) {
            List<Integer> list = counts.computeIfAbsent(groupSize[i], k -> new ArrayList<>());
            list.add(i);
            if (list.size() == groupSize[i]) {
                groups.add(list);
                counts.put(groupSize[i], new ArrayList<>());
            }
        }
        return groups;
 */