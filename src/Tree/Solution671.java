package Tree;

public class Solution671 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left==null) return -1;
        int left = root.left.val;
        int right = root.right.val;
        if (root.left.val == root.val) left=findSecondMinimumValue(root.left);
        if (root.right.val == root.val) right=findSecondMinimumValue(root.right);
        if (left!=-1 && right!=-1){
            return Math.min(left,right);
        }
        if (left!=-1) return left;
        return right;
    }
}
