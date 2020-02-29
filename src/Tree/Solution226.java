package Tree;
// invert tree
public class Solution226 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){val = _val;}
    }
    public TreeNode invertTree(TreeNode root){
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right  = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
