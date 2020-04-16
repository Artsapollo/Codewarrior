package leetcode;

import Nodes.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        if (root != null) {
            postorder(root, arr);
        }

        for (int i : arr) {
            if (set.contains(k - i)) {
                return true;
            } else {
                set.add(i);
            }
        }

        return false;
    }

    private void postorder(TreeNode root, List<Integer> arr) {

        if (root.left != null) {
            postorder(root.left, arr);
        }

        if (root.right != null) {
            postorder(root.right, arr);
        }

        arr.add(root.val);
    }
}
