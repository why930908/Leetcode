package Tree;

/**
 * @program: Leetcode
 * @description: 二叉树首个公共祖先
 * @author: Wanghaoyu
 * @create: 2020-06-10 16:11
 **/
public class Interview0408 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (left != null && right != null) return root;
        if (left == null) return right;
        else return left;

    }
}
