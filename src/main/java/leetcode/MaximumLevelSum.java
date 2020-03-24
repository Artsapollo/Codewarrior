package leetcode;

import Nodes.TreeNode;

import java.util.HashMap;
import java.util.Map;

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
    int level = 0;
    Map<Integer, Integer> summs = new HashMap<>();

    public int maxLevelSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        checkSum(root);
        return 1;
    }

    public void checkSum(TreeNode root) {
        level++;
        if (root == null) {
            return;
        } else if (level == 1) {
            summs.put(level, root.val);
        } else if (root.left != null && root.right != null) {
            summs.put(level++, (root.left.val + root.right.val));
        } else if (root.left != null) {
            checkSum(root.left);
        } else if (root.right != null) {
            checkSum(root.right);
        }
    }
}
