package BinaryTreeGeneral;

public class Flatten {
    public static void main(String[] args) {

    }

    TreeNode newRight = null;

    public void flatten(TreeNode root) {

        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.left = null;

        root.right = newRight;

        newRight = root;


    }
}
