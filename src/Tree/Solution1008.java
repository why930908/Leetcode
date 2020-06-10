package Tree;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @description: 先序遍历构造二叉搜索树
 * @author: Wanghaoyu
 * @create: 2020-06-10 15:03
 **/
public class Solution1008 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int _val){
            this.val = _val;
        }
        TreeNode(int _val, TreeNode left, TreeNode right){
            val = _val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int tmp = preorder.length;
        for (int i = 1; i < preorder.length; i++){
            if (preorder[i] > root.val) {
                tmp = i;
                break;
            }

        }
        root.left = bstFromPreorder(Arrays.copyOfRange(preorder,1,tmp));
        root.right = bstFromPreorder(Arrays.copyOfRange(preorder,tmp,preorder.length));
        return root;
    }

    public static void main(String[] args) {
        int[] tmp = new int[]{8,5,1,7,10,12};
        bstFromPreorder(tmp);
    }
}
