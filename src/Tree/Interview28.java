package Tree;

/**
 * @program: Leetcode
 * @description: 对称二叉树
 * @author: Wanghaoyu
 * @create: 2020-06-09 18:29
 **/
public class Interview28 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return dfs(root.left,root.right);
    }
    private boolean dfs(TreeNode left,TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return dfs(left.left,left.right) && dfs(left.right,left.left);
    }
}
