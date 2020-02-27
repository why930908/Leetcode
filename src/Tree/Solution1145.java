package Tree;

public class Solution1145 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    private int val,left,right;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x){
        val =x;
        int half = n / 2;
        dfs(root);
        if (left > half || right > half || (left + right) < half){
            return true;
        }
        else return false;
    }
    public int dfs(TreeNode root){
        int left_num = 0;
        int right_num = 0;
        if (root.left != null){
            left_num = dfs(root.left);
        }
        if (root.right !=  null){
            right_num = dfs(root.right);
        }
        if (root.val == val){
            left = left_num;
            right = right_num;
        }
        return left_num + right_num +1;
    }
}
