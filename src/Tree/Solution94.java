package Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution94 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val= x;}
    }
    public void f1(TreeNode root,List<Integer> res){
        if (root != null){
            if (root.left!=null){ f1(root.left,res);};
            res.add(root.val);
            if (root.right!=null){ f1(root.right,res);}
        }
    }
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        f1(root,res);
        return res;
    }

}
