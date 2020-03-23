package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/3/5
 */
public class Solution113 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    private List<List<Integer>> ans;
    private int sum;
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        this.sum = sum;
        ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        helper(root,tmp);
        return ans;
    }
    public void helper(TreeNode root,List<Integer> tmp){
        if (root.left == null && root.right == null){
            if (sum == 0) {ans.add(tmp);}
            sum+=tmp.get(tmp.size()-1);
            tmp.remove(tmp.size()-1);
            return;
        }
        tmp.add(root.val);
        sum-=root.val;
        if (root.left!=null)helper(root.left,tmp);
        if (root.right!=null)helper(root.right,tmp);
    }
}
