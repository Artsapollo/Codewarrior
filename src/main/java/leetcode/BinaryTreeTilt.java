package leetcode;

import Nodes.TreeNode;

public class BinaryTreeTilt {
    int result = 0;

    public int findTilt(TreeNode root) {
        if(root != null){
            tilt(root);
        }

        return result;
    }

    public int tilt(TreeNode node){
        if(node == null) return 0;

        int left = tilt(node.left);
        int right = tilt(node.right);

        result += Math.abs(left - right);

        return left + right + node.val;
    }
}
