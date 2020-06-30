package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @description: 二叉树的层平均值
 * @author: Wanghaoyu
 * @create: 2020-06-12 15:02
 **/
public class Solution637 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.add(root);
        while (!queue.isEmpty()){
            int length = queue.size();
            double sum = 0;
            for (int i = 0; i < length; i++){
                TreeNode tmp = queue.poll();
                if (tmp.left != null) queue.add(tmp.left);
                if (tmp.right != null) queue.add(tmp.right);
                sum += tmp.val;
            }
            res.add(sum/length);
        }
        return res;
    }
}
