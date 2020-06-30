package Tree;

/**
 * @program: Leetcode
 * @description: 删除指定值的叶子结点
 * @author: Wanghaoyu
 * @create: 2020-06-11 11:07
 **/
public class Solution1325 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int _val){
            val = _val;
        }
        TreeNode(int _val, TreeNode left, TreeNode right){
            val = _val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;
        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);
        if (root.left == null && root.right == null && root.val == target) return null;
        return root;
    }

}
