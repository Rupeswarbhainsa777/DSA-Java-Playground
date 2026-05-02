package BinaryTreeGeneral;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder1(TreeNode root) {

        List<List<Integer>> li = new ArrayList<>();
        if (root == null) return li;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                res.add(node.val);
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }
            li.add(res);
        }

        return li;

    }

    public static List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if (root == null) return li;
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);

        while (!que.isEmpty()) {

            TreeNode node = que.remove();
            if (node == null) {
                li.add(new ArrayList<>(res));
                res.clear();
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }

            } else {
                res.add(node.val);


                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }


        }
        return li;

    }
}
