package Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: Leetcode
 * @description: 删点成林
 * @author: Wanghaoyu
 * @create: 2020-06-05 10:02
 **/
public class Solution1110 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val=_val; }
    }
    Set<Integer> set = new HashSet<>();
    List<TreeNode> ans = new ArrayList<>();

    private TreeNode dfs(TreeNode root){
        if (root == null) return null;
        root.left = dfs(root.left);
        root.right = dfs(root.right);
        if (set.contains(root.val)){
            if (root.left != null) ans.add(root.left);
            if (root.right != null) ans.add(root.right);
            root = null;
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int d : to_delete){
            set.add(d);
        }
        if (!set.contains(root.val)){
            ans.add(root);
        }
        dfs(root);
        return ans;
    }
}
