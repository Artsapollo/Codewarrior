package leetcode.BinaryLesson;

import Nodes.TreeNode;

public class BSTtoGreaterTree {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }

        convertBST(root.right);

        int t = root.val;
        root.val += sum;
        sum += t;

        convertBST(root.left);

        return root;
    }
}
