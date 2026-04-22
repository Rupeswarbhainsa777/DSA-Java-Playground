package BinaryTreeGeneral;

import java.util.*;

public class PathSum {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum1(TreeNode root, int targetSum) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sumPath = new Stack<>();

        stack.push(root);
        sumPath.push(root.val);

        while (!stack.isEmpty()) {
            TreeNode val = stack.pop();
            int sum = sumPath.pop();

            if (val.right == null && val.left == null && sum == targetSum) {
                return true;
            }
            if (val.right != null) {
                stack.push(val.right);
                sumPath.push(val.right.val + sum);
            }
            if (val.left != null) {
                stack.push(val.left);
                sumPath.push(val.left.val + sum);
            }
        }
        return false;

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        findAllValues(root, 0, set);

        if (set.contains(targetSum)) {
            return true;
        }
        return false;


    }

    public static void findAllValues(TreeNode root, int sum, Set<Integer> li) {
        if (root == null) return;

        sum = sum + root.val;

        if (root.left == null && root.right == null) {
            li.add(sum);
            return;
        }

        findAllValues(root.left, sum, li);
        findAllValues(root.right, sum, li);

    }
}
