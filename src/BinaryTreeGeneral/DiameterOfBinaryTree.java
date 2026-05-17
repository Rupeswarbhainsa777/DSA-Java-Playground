package BinaryTreeGeneral;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {


        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int rootHeight = heightOfTree(root.left) + heightOfTree(root.right);

        return Math.max(Math.max(leftHeight, rightHeight), rootHeight);
    }

    private static int heightOfTree(TreeNode root) {
        if (root == null) return 0;
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        return Math.max(left, right) + 1;
    }
}
