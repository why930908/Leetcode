package ListNode;

/**
 * @program: Leetcode
 * @description: 合并排序链表
 * @author: Wanghaoyu
 * @create: 2020-06-12 16:56
 **/
public class Interview25 {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
