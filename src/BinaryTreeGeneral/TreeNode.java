package BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void printLevel(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);

        while (!que.isEmpty()) {

            TreeNode node = que.remove();
            if (node == null) {
                System.out.println();
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }

            } else {
                System.out.println(node.val + " ");

                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }


        }
    }

//    public static void preOrder(TreeNode root){
//
//    }

}
