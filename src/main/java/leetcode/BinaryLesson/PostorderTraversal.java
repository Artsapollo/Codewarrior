package leetcode.BinaryLesson;

import Nodes.TreeNode;

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
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            postOrder(root, result);
        }
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result) {

        if (root.left != null) {
            postOrder(root.left, result);
        }

        if (root.right != null) {
            postOrder(root.right, result);
        }

        result.add(root.val);
    }
}