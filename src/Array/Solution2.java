package Array;

//Listnode +

public class Solution2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int tmp =0;
        ListNode res= new ListNode(0);
        ListNode current = res;
        while (l1!=null || l2!=null){
            int x1 = l1==null? 0 : l1.val;
            int x2 = l2==null? 0 : l2.val;
            current.next = new ListNode((x1+x2+tmp)%10);
            current = current.next;
            tmp=(x1+x2+tmp)/10;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        if (tmp == 1) current.next = new ListNode(1);
        return res.next;
    }
}
