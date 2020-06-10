package Tree;

/**
 * @program: Leetcode
 * @description: 监控二叉树
 * @author: Wanghaoyu
 * @create: 2020-06-10 10:47
 **/
//定义三种状态
//    第一种：该节点未被覆盖 1
//    第二种：该节点被覆盖但是没有相机 2
//    第三种：该节点有相机 3
public class Solution968 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

    }
    int ans;
    public int minCameraCover(TreeNode root) {
        ans = 0;
        if (dfs(root) == 1) ans++;
        return ans;
    }
    private int dfs(TreeNode node){
        if (node == null) return 2;
        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left == 1 || right == 1) {
            ans++;
            return 3;
        }
        if (left == 2 && right == 2) {
            return 1;
        }
        if (left + right >= 5) return 2;
        return 0;
    }
}
