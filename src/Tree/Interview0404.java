package Tree;

/**
 * @program: Leetcode
 * @description: 检查平衡性
 * @author: Wanghaoyu
 * @create: 2020-06-04 12:00
 **/
public class Interview0404 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val; }
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(ishigh(root.left) - ishigh(root.right)) > 1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    private int ishigh(TreeNode root){
        if (root == null) return 0;
        return (Math.max(ishigh(root.left) , ishigh(root.right)) +1);
    }
}
