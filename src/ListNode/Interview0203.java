package ListNode;

/**
 * @program: Leetcode
 * @description: 删除中间节点
 * @author: Wanghaoyu
 * @create: 2020-06-15 11:05
 **/
public class Interview0203 {
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int _val){
            val = _val;
        }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
