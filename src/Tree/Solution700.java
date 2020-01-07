package Tree;
//BST
public class Solution700 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public TreeNode searchBST(TreeNode root,int val){
        while (root!=null){
            if (val == root.val) return root;
            else if (val < root.val) root = root.left;
            else root = root.right;
        }
        return root;
    }
}
