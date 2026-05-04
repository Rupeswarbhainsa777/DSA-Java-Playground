package BinaryTreeGeneral;

public class HeightOfTree {
    public static void main(String[] args) {

    }

    public static int heightOfTree(TreeNode root) {
         if(root==null) return 0;

         int left = heightOfTree(root.left);
         int right = heightOfTree(root.right);

         int max = Math.max(left,right)+1;
         return max;
    }
}
