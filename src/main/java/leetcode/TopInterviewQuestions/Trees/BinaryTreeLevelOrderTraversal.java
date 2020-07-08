package leetcode.TopInterviewQuestions.Trees;
/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
 */

import Nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            levels(root, result, 0);
        }

        return result;
    }

    private void levels(TreeNode root, List<List<Integer>> list, int level) {
        if (root == null) return;

        if (level >= list.size()) {
            list.add(new ArrayList());
        }

        list.get(level).add(root.val);

        levels(root.left, list, level + 1);
        levels(root.right, list, level + 1);

    }
}
