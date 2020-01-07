package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//乱了乱了 有问题
public class Solution103 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()){
            res.add(new LinkedList<>());
            int size = queue.size();
            if (level%2==0)
            {
                for (int i = 0; i < size;i++){
                TreeNode node = queue.removeFirst();
                res.get(level).add(node.val);
                 if (node.left!=null) queue.offer(node.left);
                 if (node.right!=null) queue.offer(node.right);
                }
            }
                else {
                    for (int i = 0;i <size;i++) {
                        TreeNode node = queue.removeLast();
                        res.get(level).add(node.val);
                        if (node.right!=null) queue.offer(node.right);
                        if (node.left!=null) queue.offer(node.left);
                    }
                }
                level++;
            }
        return res;
        }
    }

