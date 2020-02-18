package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//递归 List: add(i,val)
public class Solution103 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<List<Integer>> res = new LinkedList<List<Integer>>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return res;
        helper(root,0);
        return res;
    }
    public void helper(TreeNode root,int level){
        if (res.size() >= level){
            res.add(new LinkedList<Integer>());
        }
        if (level%2==0){
            res.get(level).add(root.val);
        }else res.get(level).add(0,root.val);
        if (root.left!=null) helper(root.left,level+1);
        if (root.right!=null) helper(root.right,level+1);
    }
}

