package leetcode;

import Nodes.TreeNode;

/*
Example 1:
     1
    /  \
   7    0
  / \
 7  -8
Input: [1,7,0,7,-8,null,null]
Output: 2
Explanation:
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
 */
public class MaximumLevelSum {

    public int maxLevelSum(TreeNode root) {
        int[] arr = new int[(int) Math.pow(10, 4) + 1];
        levels(root, arr, 1);
        int resultLevel = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[resultLevel]) {
                resultLevel = i;
            }
        }
        return resultLevel;
    }

    public void levels(TreeNode root, int[] arr, int level) {
        if (root == null) return;
        arr[level] += root.val;
        levels(root.left, arr, level + 1);
        levels(root.right, arr, level + 1);
    }
}
