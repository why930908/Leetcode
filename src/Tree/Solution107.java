package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//DFS和BFS
//BFS有错误，暂时没找到错误原因
public class Solution107 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
        /*public void helper(List<List<Integer>> res,TreeNode root,int level){
            if (root!=null){
                if (level == res.size())
                    res.add(0,new ArrayList<>());
                res.get(res.size()-1-level).add(root.val);
                if (root.left!=null) helper(res,root.left,level+1);
                if (root.right!=null) helper(res,root.right,level+1);
            }
        }
        public List<List<Integer>> levelOrderBottom(TreeNode root){
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) return res;
            helper(res,root,0);
            return res;
        }*/
        public List<List<Integer>> levelOrderBottom(TreeNode root){
            LinkedList<List<Integer>> res = new LinkedList<>();
            if (root == null) return res;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                res.addFirst(new LinkedList<>());
                for (int i = 0; i < queue.size();i++){
                    TreeNode node = queue.remove();
                    res.get(0).add(node.val);
                    if (node.left!=null) queue.add(node.left);
                    if (node.right!=null) queue.add(node.right);
                }
            }
            return res;
        }
    }
