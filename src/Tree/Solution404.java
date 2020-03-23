package Tree;

/**
 * Created by wanghaoyu on 2020/3/17
 */
public class Solution404 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    private int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        helper(root,false);
        return sum;
    }
    private void helper(TreeNode root,Boolean b){
        if (root == null) return;
        helper(root.left,true);
        helper(root.right,false);
        if (root.left == null && root.right == null && b){
            sum+=root.val;
        }
    }
}
