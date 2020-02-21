package Tree;

public class Solution559 {
    private int max = 1,cur =1;
    public int maxDepth(Node root) {
        if (root == null) return 0;
        helper(root,max,cur);
        return max;
    }
    public int helper(Node root,int max,int cur){
        if (root.children == null){
            max=Math.max(max,cur);
        }else {
            for (Node tmp : root.children){
                cur++;
                helper(tmp,max,cur);
            }

        }
        return max;
    }
}
