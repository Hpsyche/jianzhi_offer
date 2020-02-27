package com.hpsyche;

import com.hpsyche.utils.ListNode;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class DeleteNode {
    public ListNode removeElements(ListNode head, int val) {
        while (head.next!=null){
            ListNode next=head.next;
            if(next.val==val){
                head.next=next.next;
            }
            head=head.next;
        }
        return head;
    }
}
