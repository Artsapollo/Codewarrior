package leetcode.BinaryLesson;

import java.util.ArrayList;
import java.util.List;
/*
Given a binary tree, return the postorder traversal of its nodes' values.
Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3
Output: [3,2,1]
 */
public class PostorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            preorder(root, result);
        }
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {

        if (root.left != null) {
            preorder(root.left, result);
        }

        if (root.right != null) {
            preorder(root.right, result);
        }

        result.add(root.val);
    }
}