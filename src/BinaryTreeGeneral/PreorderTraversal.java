package BinaryTreeGeneral;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);

        return list;


    }

    public static List<Integer> helper(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) return list;

        list.add(treeNode.val);

        helper(treeNode.left, list);
        helper(treeNode.right, list);

        return list;

    }
}
