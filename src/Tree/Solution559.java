package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution559 {
    class Node{
        public int val;
        public List<Node> children;
        public Node(int _val){ val = _val;}
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
        private int max = 1,cur =1;
        public int maxDepth(Node root) {
            if (root == null) return 0;
            helper(root,1);
            return this.max;
        }
        public void helper(Node root,int cur){
            if (root.children.isEmpty()){
                this.max = Math.max(this.max,cur);
            }else {
                for (Node tmp : root.children){
                    helper(tmp,cur+1);
                }
            }
        }

}
