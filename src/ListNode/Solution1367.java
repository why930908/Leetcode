package ListNode;

/**
 * @program: Leetcode
 * @description: 二叉树中的链表
 * @author: Wanghaoyu
 * @create: 2020-06-05 13:51
 **/
public class Solution1367 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
            next = null;
        }
    }
    private boolean dfs(ListNode head,TreeNode root){
        if (head == null) return true;
        if (root == null) return false;
        if (root.val != head.val) return false;
        return dfs(head.next,root.left) || dfs(head.next,root.right);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
//        dfs(head,root);
        return dfs(head,root) || isSubPath(head,root.left) || isSubPath(head,root.right);
    }
}
