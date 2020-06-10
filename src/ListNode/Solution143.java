package ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @description: 重排链表
 * @author: Wanghaoyu
 * @create: 2020-06-05 11:43
 **/
public class Solution143 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int _val){
            val = _val;
            next = null;
        }
        ListNode(int _val,ListNode _next){
            val = _val;
            next = _next;
        }

    }
    public void reorderList(ListNode head) {
        if (head == null) return;
        List<ListNode> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }
        int i = 0, j = list.size()-1;
        while (i < j){
            list.get(i).next = list.get(j);
            i++;
            if (i == j) break;
            list.get(j).next = list.get(i);
            j++;
        }
        list.get(i).next = null;
    }
}
