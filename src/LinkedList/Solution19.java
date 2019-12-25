package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//双指针
public class Solution19 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int n){val = n;}
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;

        ListNode nnode = res;
        ListNode tmp = res;
        for (int i = 0; i <=n;i++){
            tmp = tmp.next;
        }
        while (tmp!=null){
            tmp = tmp.next;
            nnode = nnode.next;
        }
        nnode.next = nnode.next.next;
        return res.next;
    }
}
