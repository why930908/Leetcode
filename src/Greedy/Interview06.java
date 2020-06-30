package Greedy;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-12 09:26
 **/
public class Interview06 {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
        }
    }
    public int[] reversePrint(ListNode head) {
        int length = 0;
        ListNode tmp = head;
        while (tmp!=null){
            tmp = tmp.next;
            length++;
        }
        int[] res = new int[length];
        for (int i = length - 1; i >= 0;i--){
            res[i] = head.val;
            head = head.next;
        }
        return res;
    }
}
