package Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution230 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public void helper(TreeNode root, List<Integer> res){
        if (root!=null){
            if (root.left!=null) helper(root.left,res);
            res.add(root.val);
            if (root.right!=null) helper(root.right,res);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res.get(k-1);
    }
}
