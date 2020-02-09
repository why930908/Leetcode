package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {
    class Node{
        public int val;
        public List<Node> children;
        public Node(){

        }
        public Node(int _val){
            val = _val;
        }
        public Node(int _val,List<Node> _children){
            val = _val;
            children = _children;
        }

    }
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        /*List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i=0; i < size;i++){
                Node node = queue.poll();
                level.add(node.val);
                queue.addAll(node.children);
            }
            result.add(level);
        }
        return result;
        die dai
        */
        if (root!=null) levelOrder1(root,0);
        return result;
    }
    private void levelOrder1(Node node,int level){
        if (result.size()<=level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        for (Node children : node.children){
            levelOrder1(children,level+1);
        }
    }

}
