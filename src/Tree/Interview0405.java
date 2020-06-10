package Tree;

/**
 * @program: Leetcode
 * @description: 判断二叉搜索树
 * @author: Wanghaoyu
 * @create: 2020-06-10 10:02
 **/
public class Interview0405 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left,root.val,Long.MIN_VALUE) && dfs(root.right,Integer.MAX_VALUE,root.val);
    }
    public boolean dfs(TreeNode node,long max,long min){
        if (node == null) return true;
        if (node.val >= max || node.val <= min) return false;
        return dfs(node.left,node.val,min) && dfs(node.right,max,node.val);
    }
}
