package Bitwise;

public class Solution1290 {
     public class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }
    public int getDecimalValue(ListNode head) {
        ListNode tmp = head;
        int res = 0;
        while (tmp != null){
            res<<=1;

            res+=tmp.val;
            tmp=tmp.next;
        }
        return res;
    }
}
