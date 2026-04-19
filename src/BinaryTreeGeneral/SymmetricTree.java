package BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> leftQue = new LinkedList<>();
        Queue<TreeNode> rightQue = new LinkedList<>();


        leftQue.add(root.left);
        rightQue.add(root.right);

        while (!leftQue.isEmpty() && !rightQue.isEmpty()) {

            TreeNode leftNode = leftQue.poll();
            TreeNode rightNode = rightQue.poll();
            if(leftNode== null && rightNode==null){
                continue;
            }
            if(leftNode==null || rightNode==null){
                return false;
            }
            if (leftNode.val != rightNode.val) {
                return false;
            }
            leftQue.add(leftNode.left);
            leftQue.add(leftNode.right);


            rightQue.add(rightNode.right);
            rightQue.add(rightNode.left);

        }
        return true;

    }
}
