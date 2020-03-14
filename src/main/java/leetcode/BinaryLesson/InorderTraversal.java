package leetcode.BinaryLesson;

import java.util.ArrayList;
import java.util.List;
/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3
Output: [1,3,2]
 */

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root != null) {
            inorder(root, result);
        }
        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {

        if (root.left != null) {
            inorder(root.left, result);
        }

        result.add(root.val);

        if (root.right != null) {
            inorder(root.right, result);
        }
    }
}

