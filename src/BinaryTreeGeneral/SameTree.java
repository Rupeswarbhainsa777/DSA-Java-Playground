package BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null) {
                continue;
            } else if (left == null || right == null || right.val != left.val) {
                return false;
            }

            queue.add(left.left);
            queue.add(right.left);
            queue.add(left.right);

            queue.add(right.right);
        }
        return true;

    }
}
