package BinaryTreeGeneral;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);

        return list;

    }

    private static List<Integer> helper(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) return list;


        helper(treeNode.left, list);
        helper(treeNode.right, list);
        list.add(treeNode.val);

        return list;

    }
}
