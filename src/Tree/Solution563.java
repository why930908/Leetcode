package Tree;

public class Solution563 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    private int res=0;
    public int findTilt(TreeNode root){
        if (root != null){
            if (root.left!= null) findTilt(root.left);
            if (root.right!= null) findTilt(root.right);
            root.val += ((root.left == null ? 0 : root.left.val) + (root.right == null ? 0 : root.right.val));
            res += Math.abs((root.left == null ? 0 : root.left.val) - (root.right == null ? 0 : root.right.val));
        }
        return res;
    }

}
