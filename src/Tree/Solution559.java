package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution559 {
    class Node{
        public int val;
        public List<Node> children;
        public Node(int _val){ val = _val;}
    }
    private int max = 1,cur =1;
    public int maxDepth(Node root) {
        if (root == null) return 0;
        helper(root,1,1);
        return max;
    }
    public void helper(Node root,int max,int cur){
        if (root.children.isEmpty()){
            max = Math.max(max,cur);
        }else {
            for (Node tmp : root.children){
                helper(tmp,max,cur+1);
            }
        }
    }

}
