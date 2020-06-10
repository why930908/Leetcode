package ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode
 * @description: 环形链表
 * @author: Wanghaoyu
 * @create: 2020-06-05 11:37
 **/
public class Solution142 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
