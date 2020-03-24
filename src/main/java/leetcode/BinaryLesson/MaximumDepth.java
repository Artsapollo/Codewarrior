package leetcode.BinaryLesson;

import Nodes.TreeNode;

/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Note: A leaf is a node with no children.

Example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */
public class MaximumDepth {
    int maxLevel = 0;

    public int maxDepth(TreeNode root) {

        if (root != null) {
            depth(root, maxLevel + 1);
        }
        return maxLevel;
    }

    private void depth(TreeNode root, int maxLevel) {
        this.maxLevel = Math.max(maxLevel, this.maxLevel);

        if (root.left != null) {
            depth(root.left, maxLevel + 1);
        }

        if (root.right != null) {
            depth(root.right, maxLevel + 1);
        }
    }
}