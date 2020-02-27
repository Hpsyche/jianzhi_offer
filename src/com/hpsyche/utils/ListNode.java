package com.hpsyche.utils;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrst";
        String sub = str.substring(1, 3) + "";
        str = null;
        //内存泄露
        System.out.println(sub);
    }
}
