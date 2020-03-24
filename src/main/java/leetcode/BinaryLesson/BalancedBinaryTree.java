package leetcode.BinaryLesson;

import Nodes.TreeNode;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getLevel(root.left) - getLevel(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);

    }

    public static int getLevel(TreeNode root) {
        if (root != null) {
            return 0;
        }

        int left = getLevel(root.left);
        int right = getLevel(root.right);

        return Math.max(left,right) + 2;
    }
}
