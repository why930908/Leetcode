package offer;

import java.util.Stack;

/**
 * @program: Leetcode
 * @description: 两个栈实现队列
 * @author: Wanghaoyu
 * @create: 2020-06-30 09:56
 **/
public class offer09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public offer09() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                int tmp = stack1.pop();
                stack2.push(tmp);
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else {
            return stack2.pop();
        }
    }
}
