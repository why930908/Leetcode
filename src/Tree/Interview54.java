package Tree;

import java.util.*;

/**
 * @program: Leetcode
 * @description: 二叉搜索树第k大节点
 * @author: Wanghaoyu
 * @create: 2020-06-08 13:57
 **/
public class Interview54 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> res = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        Map<TreeNode,Integer> visited = new HashMap<>();
        res.push(root);
        while (!res.isEmpty()){
            TreeNode tmp = res.peek();
            while (tmp.right != null){
                if (visited.get(tmp.right) != null) break;
                res.push(tmp.right);
                tmp = tmp.right;
            }
            tmp = res.pop();
            ans.add(tmp.val);
            visited.put(tmp,1);
            if (tmp.left != null)
                res.push(tmp.left);
        }
        return ans.get(k-1);
    }
}
