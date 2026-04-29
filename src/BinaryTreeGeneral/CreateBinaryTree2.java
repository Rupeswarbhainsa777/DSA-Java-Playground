package BinaryTreeGeneral;

import java.util.HashMap;
import java.util.Map;

public class CreateBinaryTree2 {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(postorder, map, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] postorder, Map<Integer, Integer> map, int rootIdx, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[rootIdx]);
        int last = map.get(postorder[rootIdx]);

        int rightSize = right - last;

        root.right = helper(postorder, map, rootIdx - 1, last + 1, right);
        root.left = helper(postorder, map,
                rootIdx - rightSize - 1,
                left,
                last - 1);

        return root;


    }
}
