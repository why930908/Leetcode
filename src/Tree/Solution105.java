package Tree;

import java.util.HashMap;

/**
 * Created by wanghaoyu on 2020/3/23
 */
public class Solution105 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }

        int pre_idx = 0;
        int[] preorder;
        int[] inorder;
        HashMap<Integer,Integer> idx_map = new HashMap<Integer, Integer>();
        public TreeNode helper(int in_left,int in_right){
            if (in_left == in_right) return null;
            int root_val = preorder[pre_idx];
            TreeNode root = new TreeNode(root_val);
            int index = idx_map.get(root_val);
            pre_idx++;
            root.left = helper(in_left,index);
            root.right = helper(index+1,in_right);
            return root;
        }
        public TreeNode buildTree(int[] preorder,int[] inorder){
            this.preorder = preorder;
            this.inorder =inorder;
            int idx = 0;
            for (Integer val : inorder){
                idx_map.put(val,idx++);
            }
            return helper(0,inorder.length);
        }

}
