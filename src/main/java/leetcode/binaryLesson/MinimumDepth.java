package leetcode.binaryLesson;

import Nodes.TreeNode;

/*
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.
 */
public class MinimumDepth {

    public int minDepth(TreeNode root) {
        return depth(root);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right != null) {
            return Math.min(depth(root.left), depth(root.right)) + 1;
        } else {
            return Math.max(depth(root.left), depth(root.right)) + 1;
        }
    }
}
