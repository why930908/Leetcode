package LinkedList;
//reverse ListNode
public class Solution206 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int n) {val=n;}
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while (curr!=null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return curr.next;
    }
}
