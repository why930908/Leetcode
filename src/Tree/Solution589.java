package Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution589 {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while (stack.size()!=0){
            Node node = stack.pollFirst();
            res.add(node.val);
            for (int i = node.children.size()-1; i >= 0;i--)
                stack.addFirst(node.children.get(i));
        }
        return res;
    }
}
