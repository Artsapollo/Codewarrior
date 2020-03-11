package leetcode.BinaryLesson;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
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