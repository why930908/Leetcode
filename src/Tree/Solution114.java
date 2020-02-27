package Tree;

public class Solution114 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    public void flatten(TreeNode root) {
        if (root == null) return;
        if (root.right != null) flatten(root.right);
        if (root.left != null) flatten(root.left);
        
    }
}
