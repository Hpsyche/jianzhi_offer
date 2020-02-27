package com.hpsyche.Jianzhi;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 两栈
 */
public class TwoStackInsteadQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
