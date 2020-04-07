package leetcode.BinaryLesson;

import Nodes.TreeNode;

public class SearchInBST {
    private TreeNode node = new TreeNode(3);

    public TreeNode searchBST(TreeNode root, int val) {
        if (root != null) {
            postOrder(root, val);
        }

        if (node.val == 0) {
            return null;
        }

        return node;
    }

    public void postOrder(TreeNode root, int val) {
        if (root.left != null) {
            postOrder(root.left, val);
        }

        if (root.right != null) {
            postOrder(root.right, val);
        }

        if (root.val == val) {
            node = root;
        }
    }
}
