package Tree;

/**
 * Created by wanghaoyu on 2020/3/24
 */
public class Solution236 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    TreeNode ans;
    public boolean helper(TreeNode root,TreeNode p,TreeNode q){
        if (root == null) return false;
        int middle = (root.val == p.val || root.val == q.val) ? 1 : 0;
        int left = this.helper(root.left,p,q) ? 1: 0;
        int right = this.helper(root.right,p,q) ? 1 : 0;
        if (middle + left + right > 1){
            this.ans = root;
        }
        return middle + left + right > 0 ;
    }
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        helper(root,p,q);
        return this.ans;
    }
}
