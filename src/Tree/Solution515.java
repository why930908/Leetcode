package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @description: 树每层的最大值
 * @author: Wanghaoyu
 * @create: 2020-06-11 16:06
 **/
public class Solution515 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    List<Integer> res;
    public List<Integer> largestValues(TreeNode root) {
//        if (root == null) return new ArrayList<>();
//        List<Integer> res = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            int max = Integer.MIN_VALUE;
//            for (int i = 0; i < size; i++){
//                TreeNode tmp = queue.poll();
//                max = Math.max(max,tmp.val);
//                if (tmp.left != null) queue.add(tmp.left);
//                if (tmp.right != null) queue.add(tmp.right);
//            }
//            res.add(max);
//        }
//        return res;
        res = new ArrayList<>();
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root, int depth){
        if (root == null) return;
        if (res.size() == depth){
            res.add(root.val);
        }else {
            res.set(depth,Math.max(res.get(depth),root.val));
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}
