package Tree;

/**
 * @program: Leetcode
 * @description: 二叉树最近的公共祖先
 * @author: Wanghaoyu
 * @create: 2020-06-08 16:02
 **/
public class Interview68 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
