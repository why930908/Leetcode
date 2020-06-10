package Tree;

/**
 * @program: Leetcode
 * @description: 判断子树
 * @author: Wanghaoyu
 * @create: 2020-06-10 14:32
 **/
public class Interview0410 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){
            val = _val;
        }
    }
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2 == null;
        return isSame(t1,t2) || checkSubTree(t1.left,t2) || checkSubTree(t1.right,t2);
    }
    private boolean isSame(TreeNode n1, TreeNode n2){
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        return n1.val == n2.val && isSame(n1.left,n2.left) && isSame(n1.right,n2.right);
    }
}
