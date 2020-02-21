package Tree;

import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Solution590 {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while (stack.size()!=0){
            Node node = stack.pollLast();
            res.addFirst(node.val);
            for (Node tmp : node.children)
                stack.addFirst(tmp);
        }
        return res;
    }

}
