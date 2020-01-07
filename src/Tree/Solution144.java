package Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution144 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val= x;}
    }
    public void f1(TreeNode root, List<Integer> res){
        if (root != null){
            res.add(root.val);
            if (root.left!=null){ f1(root.left,res);};
            if (root.right!=null){ f1(root.right,res);}

        }

    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        f1(root,res);
        return res;
    }
}
