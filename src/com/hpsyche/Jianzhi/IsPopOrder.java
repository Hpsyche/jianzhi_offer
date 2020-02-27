package com.hpsyche.Jianzhi;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 是否后序遍历
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int popIndex=0;
        for (int value : pushA) {
            stack.push(value);
            while (!stack.isEmpty()&&stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
