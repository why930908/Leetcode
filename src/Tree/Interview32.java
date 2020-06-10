package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @description: 从上到下打印二叉树
 * @author: Wanghaoyu
 * @create: 2020-06-08 18:30
 **/
public class Interview32 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            res.add(tmp.val);
            if (tmp.left != null) queue.add(tmp.left);
            if (tmp.right != null) queue.add(tmp.right);
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < ans.length; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
