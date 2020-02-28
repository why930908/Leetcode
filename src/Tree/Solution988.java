package Tree;
// 从根到叶节点遍历树时，用dfs和dfs(root.left),dfs(root.right),string.delete
public class Solution988 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    String ans = "~";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return ans;
    }
    public void dfs(TreeNode root,StringBuilder sb){
        if ( root == null) return;
        sb.append((char) (root.val + 'a'));
        if (root.left == null && root.right == null){
            String tmp = sb.reverse().toString();
            sb.reverse();
            if (tmp.compareTo(ans) < 0){
                ans = tmp;
            }
        }
        dfs(root.left,sb);
        dfs(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
