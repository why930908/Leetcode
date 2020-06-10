package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @description: 从上到下打印二叉树
 * @author: Wanghaoyu
 * @create: 2020-06-09 09:59
 **/
public class Interview32_2 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return ans;
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            int height = queue.size();
            for (int i = 0; i < height; i++){
                TreeNode tmp1 = queue.poll();
                tmp.add(tmp1.val);
                if (tmp1.left != null) queue.add(tmp1.left);
                if (tmp1.right != null) queue.add(tmp1.right);
            }
            ans.add(tmp);
        }
        return ans;
    }
}
