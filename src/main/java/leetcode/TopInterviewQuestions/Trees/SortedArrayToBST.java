package leetcode.TopInterviewQuestions.Trees;

import Nodes.TreeNode;

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode result = buildTree(nums, 0, nums.length - 1);
        System.out.println(result);
    }

    private static TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = buildTree(nums, start, mid - 1);
        node.right = buildTree(nums, mid + 1, end);

        return node;
    }
}
