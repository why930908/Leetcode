package Tree;

import java.util.*;

/**
 * @program: Leetcode
 * @description: 二叉搜索树的众数
 * @author: Wanghaoyu
 * @create: 2020-06-11 13:37
 **/
public class Solution501 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    Map<Integer,Integer> count;
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        count = new HashMap<>();
        dfs(root);
        Object[] values = count.values().toArray();
        Arrays.sort(values);
        Set<Integer> set = new HashSet<>();
//        if (values.length == 0) return new int[0];
        int max = (int) values[values.length - 1];
        for (int key : count.keySet()){
            if (count.get(key) == max) set.add(key);
        }
        int[] ans = new int[set.size()];
        int i = 0;
        for (int tmp : set){
            ans[i] = tmp;
            i++;
        }
        return ans;
    }
    private void dfs(TreeNode root){
        if (root == null) return;
        count.put(root.val,count.getOrDefault(root.val,0)+1);
        dfs(root.left);
        dfs(root.right);
    }
}
