package Tree;

//if(!) false digui very important!
public class Solution101 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }

    public boolean isSymmetric(TreeNode root){
        return isSymmetric(root,root);
    }
    private boolean isSymmetric(TreeNode left,TreeNode right){
        if (left==null && right==null) return true;
        if (left==null || right==null) return false;
        if (left.val!=right.val) return false;
        if (!isSymmetric(left.left,right.right)) return false;
        if (!isSymmetric(left.right,right.left)) return false;
        return true;
    }



}
