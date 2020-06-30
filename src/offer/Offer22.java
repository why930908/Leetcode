package offer;

/**
 * @program: Leetcode
 * @description: 链表倒数第k个节点
 * @author: Wanghaoyu
 * @create: 2020-06-30 10:35
 **/
public class Offer22 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int _val){
            val = _val;
        }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        //双指针，其中former为前指针，latter为比former快k个节点的后指针
        ListNode former = head, latter = head;
        while (k!=0){
            latter = latter.next;
            k--;
        }
        //将两个指针同时后移，使得latter指针刚好指向null，这时former指针即为倒数第k个指针
        while (latter!=null){
            latter = latter.next;
            former = former.next;
        }
        return former;
    }
}
