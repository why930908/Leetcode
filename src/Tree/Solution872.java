package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @description: 叶子相似的树
 * @author: Wanghaoyu
 * @create: 2020-06-04 10:38
 **/
public class Solution872 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val; }
    }
     ArrayList<Integer> res1;
     ArrayList<Integer> res2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        res1 = new ArrayList<>();
        res2 = new ArrayList<>();
        dfs(root1,res1);
        dfs(root2,res2);
        if (res1.size() != res2.size()) return false;
        for (int i = 0; i <res1.size();i++ ){
            if (!res1.get(i).equals(res2.get(i))) return false;
        }
        return true;
    }
    private void dfs(TreeNode root, List<Integer> res){
        if (root == null) return;
        dfs(root.left,res);
        if (root.left == null && root.right == null) res.add(root.val);
        dfs(root.right,res);
    }
}
