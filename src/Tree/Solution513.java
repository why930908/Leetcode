package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode
 * @description: 找树的左下角值
 * @author: Wanghaoyu
 * @create: 2020-06-11 15:59
 **/
public class Solution513 {
    private class TreeNode{
        int _val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            this._val = _val;
        }
    }
    TreeNode tmp;
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            tmp = queue.poll();
            if (tmp.right != null) queue.add(tmp.right);
            if (tmp.left != null) queue.add(tmp.left);
        }
        return tmp._val;
    }
}
