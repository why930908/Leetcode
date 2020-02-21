package Tree;

public class Solution100 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ _val = val;}
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        return inorderTraversal(p,q);
    }
    public boolean inorderTraversal(TreeNode p,TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        if (!inorderTraversal(p.left,q.left)) return false;
        if (!inorderTraversal(p.right,q.right)) return false;
        return true;
    }
}
