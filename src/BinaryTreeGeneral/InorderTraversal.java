package BinaryTreeGeneral;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();
        inOrder(root, li);

        return li;

    }

    public void inOrder(TreeNode root, List<Integer> li) {
        if (root == null) return;

        inOrder(root.left, li);
        li.add(root.val);
        inOrder(root.right, li);

    }
}
