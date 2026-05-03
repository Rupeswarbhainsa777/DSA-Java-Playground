package BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class CountNode {
    public static void main(String[] args) {

    }

    public static int countNodes(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        queue.add(root);
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                count++;

                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }


        }

        return count;

    }
}
