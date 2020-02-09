package LinkedList;

public class Solution160 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        while (headA!=null){
                while (headB!=null){
                    if (headA.val == headB.val) return headA;
                    headB = headB.next;
                }
                headA = headA.next;
        }
        return null;
    }
}
