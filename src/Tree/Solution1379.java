package Tree;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-15 11:32
 **/
public class Solution1379 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfs(original,cloned,target);
    }
    private TreeNode dfs(TreeNode onode,TreeNode cnode,TreeNode target){
        if (onode == target) return cnode;
        if (onode == null) return null;
        TreeNode node = dfs(onode.left,cnode.left,target);
        if (node != null) return node;
        return dfs(onode.right,cnode.right,target);

    }
}
