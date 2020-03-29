package leetcode;

import Nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            levels(result, root, 0);
        }
        return result;
    }

    public void levels(List<List<Integer>> list, TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (level >= list.size()) {
            list.add(0, new ArrayList<>());
            System.out.println("add list - " + list.size() + " : " + level);
        }

        levels(list, node.left, level + 1);
        levels(list, node.right, level + 1);

        System.out.println("Before add to list - " + list.size() + " : " + level);
        list.get(list.size() - level - 1).add(node.val);
        System.out.println("After add to list - " + (list.size() - level - 1));
    }
}
