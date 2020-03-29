package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        check(list);
    }

    public static void check(List<List<Integer>> list){
        list.add(Arrays.asList(3));
    }
}
/*
public void levelOrder(TreeNode node, List<List<Integer>> list){
        count++;

        if(node.left != null){
            levelOrder(node.left, list);
        }

        if(node.right != null){
            levelOrder(node.right, list);
        }

        if(node.left != null && node.right != null){
            list.add(Arrays.asList(node.left.val, node.right.val));
        }

        if(node.left != null && node.right == null){
            list.add(Arrays.asList(node.left.val));
        } else if(node.left == null && node.right != null){
            list.add(Arrays.asList(node.right.val));
        }

        count--;

        if(count == 0){
            list.add(Arrays.asList(node.val));
        }
    }
 */