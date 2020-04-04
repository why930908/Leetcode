package Tree;

/**
 * Created by wanghaoyu on 2020/3/23
 */
public class Solution235 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if (root == null) return null;
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p,q);
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);
        return root;
    }
}
