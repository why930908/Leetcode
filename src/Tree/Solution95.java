package Tree;

import java.util.LinkedList;
import java.util.List;

public class Solution95 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    public LinkedList<TreeNode> generate_Tree(int start,int end){
        LinkedList<TreeNode> treenode = new LinkedList<>();
        if (start > end){
            treenode.add(null);
            return treenode;
        }
        for (int i = start; i <= end;i++){
            LinkedList<TreeNode> left_tree = generate_Tree(start,i-1);
            LinkedList<TreeNode> right_tree = generate_Tree(i+1,end);
            for (TreeNode l : left_tree){
                for (TreeNode r : right_tree){
                    TreeNode current_tree = new TreeNode(i);
                    current_tree.left = l;
                    current_tree.right = r;
                    treenode.add(current_tree);
                }
            }

        }
        return treenode;
    }
    public List<TreeNode> generateTrees(int n){
        if (n == 0){
            return new LinkedList<TreeNode>();
        }
        return generate_Tree(1,n);
    }
}
