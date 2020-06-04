package Tree;/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-02 23:16
 **/

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Leetcode
 *
 * @description:序列化二叉树
 *
 * @author: Wanghaoyu
 *
 * @create: 2020-06-02 23:16
 **/
public class Interview37 {
    //定义二叉树
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val; }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if (tmp == null){
                res.append("null,");
            }else {
                res.append(tmp.val + ",");
                queue.add(tmp.left);
                queue.add(tmp.right);
            }

        }
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] val = data.substring(1,data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if (!val[i].equals("null")){
                tmp.left = new TreeNode(Integer.parseInt(val[i]));
                queue.add(tmp.left);
            }
            i++;
            if (!val[i].equals("null")){
                tmp.right = new TreeNode(Integer.parseInt(val[i]));
                queue.add(tmp.right);
            }
            i++;
        }
        return root;
    }
}
