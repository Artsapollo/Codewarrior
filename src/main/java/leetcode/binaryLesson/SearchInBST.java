package leetcode.binaryLesson;

import Nodes.TreeNode;

public class SearchInBST {
    private TreeNode node = new TreeNode(3);

    public TreeNode searchBST(TreeNode root, int val) {
        postOrder(root, val);

        if (node.val == 0) {
            return null;
        }

        return node;
    }

    public void postOrder(TreeNode root, int val) {
        if(root == null){
            return;
        }
            postOrder(root.left, val);
            postOrder(root.right, val);

        if (root.val == val) {
            node = root;
        }
    }
}
