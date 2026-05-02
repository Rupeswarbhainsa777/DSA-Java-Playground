package BinaryTreeGeneral;

import java.util.*;

public class ZigzagLevelOrder {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);

        int qVal = q.poll();
        int sVal = st.peek();
        System.out.println(qVal + " " + sVal);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> li = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            int size = st.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = st.pop();
                list.add(node.val);
                if (node.left != null) st.push(node.left);
                if (node.right != null) st.push(node.right);
            }

            li.add(list);
        }
        return li;

    }
}
