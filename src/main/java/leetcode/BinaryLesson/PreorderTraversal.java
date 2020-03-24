package leetcode.BinaryLesson;

import Nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;
/*
Given a binary tree, return the preorder traversal of its nodes' values.

Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3
Output: [1,2,3]
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            preorder(root, result);
        }
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {
        result.add(root.val);

        if (root.left != null) {
            preorder(root.left, result);
        }

        if (root.right != null) {
            preorder(root.right, result);
        }

    }
}