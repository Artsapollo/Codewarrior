package leetcode.BinaryLesson;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            preorder(root, result);
        }
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {

        if (root.left != null) {
            preorder(root.left, result);
        }

        if (root.right != null) {
            preorder(root.right, result);
        }

        result.add(root.val);
    }
}