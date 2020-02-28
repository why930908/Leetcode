package Tree;
//dfs存储father和depth
import java.util.HashMap;
import java.util.Map;

public class Solution993 {
    public class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    private Map<Integer,Integer> depth;
    private Map<Integer,TreeNode> fath;
    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        fath = new HashMap<>();
        dfs(root,null);
        if (fath.get(x) != fath.get(y) && depth.get(x) == depth.get(y))
            return true;
        else return false;
    }
    public void dfs(TreeNode node,TreeNode father){
        if (node != null)
        {depth.put(node.val,father == null ? 0 : depth.get(father.val)+1);
        fath.put(node.val,father);
        dfs(node.left,node);
        dfs(node.right,node);}
    }
}
