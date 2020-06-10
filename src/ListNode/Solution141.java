package ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode
 * @description: 环形链表
 * @author: Wanghaoyu
 * @create: 2020-06-05 10:21
 **/
public class Solution141 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head){
        Set<ListNode> tmp = new HashSet<>();
        while (head!=null){
            if (tmp.contains(head)) return true;
            tmp.add(head);
            head = head.next;
        }
        return false;
    }
}
