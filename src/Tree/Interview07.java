package Tree;

/**
 * @program: Leetcode
 * @description: 前序中序构造二叉树
 * @author: Wanghaoyu
 * @create: 2020-06-10 16:34
 **/
public class Interview07 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public TreeNode buildTree(int[] preorder,int[] inorder){
        if (preorder.length == 0 || inorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);

    }
}
