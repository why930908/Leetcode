package Tree;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-10 09:52
 **/
public class Interview55 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(height(root.left) - height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int height(TreeNode root){
        if (root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}
