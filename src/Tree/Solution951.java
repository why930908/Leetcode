package Tree;

/**
 * @program: Leetcode
 * @description: 翻转等价二叉树
 * @author: Wanghaoyu
 * @create: 2020-06-05 15:21
 **/
public class Solution951 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val; }
    }
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == root2)
            return true;
        if (root1 == null || root2 == null || root1.val != root2.val)
            return false;
        return (flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right)) || (flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left));
    }

}
