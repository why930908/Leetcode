package Tree;

public class Solution114 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    private TreeNode pre = null;

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }
}
