package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    //迭代
    /*public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            //start the current level
            levels.add(new ArrayList<Integer>());
            int level_length = queue.size();
            for (int i = 0; i < level_length; i++){
                TreeNode node = queue.remove();
                levels.get(level).add(node.val);
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
            level++;
        }
        return levels;
    }*/
    //递归
    public void helper(List<List<Integer>> res,TreeNode root,int level){
        if (root!=null){
            if (level == res.size())
                res.add(new ArrayList<>());
            res.get(level).add(root.val);
            if (root.left!=null) helper(res,root.left,level+1);
            if (root.right!=null) helper(res, root.right,level+1);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res= new ArrayList<>();
        if (root == null) return res;
        helper(res,root,0);
        return res;
    }
}
