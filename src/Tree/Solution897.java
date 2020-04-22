package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/21
 */
public class Solution897 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x;}
    }
    public List<Integer> tmp = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root){
        dfs(root);
        TreeNode ans = new TreeNode(0), cur = ans;
        for (int v : this.tmp){
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        return ans.right;
    }
    public void dfs(TreeNode root){
        if (root == null){
            return;
        }
        dfs(root.left);
        this.tmp.add(root.val);
        dfs(root.right);
    }
}
