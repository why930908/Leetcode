package ListNode;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-12 11:33
 **/
public class Interview24 {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = head.next;
        while (cur != null){
            cur.next = pre;
            pre = cur;
            cur = next;
            if (next != null)
            next = next.next;
        }
        return pre;
    }
}
