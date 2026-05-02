package BinaryTreeGeneral;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public static void main(String[] args) {

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double avg = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                avg = avg + node.val;
                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }
            list.add(avg / size);
        }
        return list;


    }
}
