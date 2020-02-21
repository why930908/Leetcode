package Tree;

public class Solution99 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    private TreeNode first = null;
    private TreeNode second = null;
    public void recoverTree(TreeNode root){
        inorderTraversal(root);
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }
    private TreeNode pre = null;
    private void inorderTraversal(TreeNode root){
        if (root == null) return;
        inorderTraversal(root.left);
        if (pre!=null && pre.val >= root.val){
            if (first == null){
                first = pre;
                second = root;
            }else second = root;
        }
        pre = root;
        inorderTraversal(root.right);
    }
}
