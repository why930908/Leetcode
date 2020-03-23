package Tree;

/**
 * Created by wanghaoyu on 2020/3/23
 */
public class Solution337 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public int rob(TreeNode root){
        if (root == null) return 0;
        int sum = root.val;
        if (root.left != null) sum+=(rob(root.left.left)+rob(root.left.right));
        if (root.right != null) sum+=(rob(root.right.left)+rob(root.right.right));
        return Math.max(sum,rob(root.left)+rob(root.right));
    }
}
