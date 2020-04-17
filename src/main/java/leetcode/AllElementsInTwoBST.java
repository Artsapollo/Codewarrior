package leetcode;

import Nodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllElementsInTwoBST {
    private int index = 0;

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        int[] arr1 = new int[5000], arr2 = new int[5000];
        getElements(root1, arr1);

        int len1 = index;
        index = 0;
        getElements(root2, arr2);

        List<Integer> result = new ArrayList<>(len1 + index);
        int i = 0, j = 0;

        while (i < len1 && j < index) {
            if (arr1[i] < arr2[j]) {
                result.add(arr1[i++]);
            } else {
                result.add(arr2[j++]);
            }
        }

        while (i < len1) result.add(arr1[i++]);
        while (j < index) result.add(arr2[j++]);

        return result;
    }

    public void getElements(TreeNode root, int[] arr) {
        if (root == null) {
            return;
        }
        getElements(root.left, arr);
        arr[index++] = root.val;
        getElements(root.right, arr);
    }
}
