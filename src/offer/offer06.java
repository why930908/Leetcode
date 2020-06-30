package offer;

/**
 * @program: Leetcode
 * @description: 从尾到头打印链表
 * @author: Wanghaoyu
 * @create: 2020-06-30 14:38
 **/
public class offer06 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
        }
    }
    public int[] reversePrint(ListNode head){
        ListNode tmp = head;
        int length = 0;
        while (tmp != null){
            length++;
            tmp = tmp.next;
        }
        int[] res = new int[length];
        for (int i = length-1; i>=0 ;i--){
            res[i] = head.val;
            head = head.next;
        }
        return res;
    }
}
