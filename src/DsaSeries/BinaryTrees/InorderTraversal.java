package DsaSeries.BinaryTrees;

import BinaryTreeGeneral.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        helper(root,list);

        return list;


    }

    public static void helper(TreeNode node, List<Integer> list) {

        if (node == null) return;

        helper(node.left);
        list.add(node, val);
        helper(node.right);
    }
}
