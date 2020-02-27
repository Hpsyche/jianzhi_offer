package com.hpsyche.Jianzhi;

import com.hpsyche.utils.ListNode;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 反转链表
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
