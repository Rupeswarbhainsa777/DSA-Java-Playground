package BinaryTreeGeneral;

import java.util.HashMap;
import java.util.Map;

public class CreateBinaryTree {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(preorder, map, 0, 0, inorder.length - 1);

    }

    private TreeNode helper(int[] preorder, Map<Integer, Integer> map, int rootIdx, int left, int right) {

        TreeNode root = new TreeNode(preorder[rootIdx]);

        int mid = map.get(preorder[rootIdx]);

        if (mid >left){
            root.left= helper(preorder,map,rootIdx+1,left,mid-1);
        }
        if (mid<right){
            root.right=helper(preorder,map,rootIdx+mid-left+1,mid+1,right);
        }
        return root;

    }
}
