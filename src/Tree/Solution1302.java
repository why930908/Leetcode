package Tree;

/**
 * @program: Leetcode
 * @description: 层数最深叶子结点之和
 * @author: Wanghaoyu
 * @create: 2020-06-04 18:39
 **/
public class Solution1302 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    int max;
    int res;
    public int deepestLeavesSum(TreeNode root) {
        max = 0;
        res = 0;
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root,int depth){
        if (root == null) return;
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
        if (depth == max) res += root.val;
        if (depth > max) {
            max = depth;
            res = root.val;
        }
    }
}
