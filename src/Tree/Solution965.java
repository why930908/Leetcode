package Tree;

public class Solution965 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    public boolean isUnivalTree(TreeNode root){
        if (root == null) return true;
        boolean right = root.right == null || (root.right.val == root.val && isUnivalTree(root.right));
        boolean left = root.left == null || (root.left.val == root.val && isUnivalTree(root.left));
        return right && left;
    }


}
