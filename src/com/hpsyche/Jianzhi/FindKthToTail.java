package com.hpsyche.Jianzhi;

import com.hpsyche.utils.ListNode;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 倒数k个节点
 */
public class FindKthToTail {
        public ListNode FindKthToTail(ListNode head, int k) {
            ListNode fast=head;
            ListNode slow=head;
            for(int i=0;i<k;i++){
                if(fast==null){
                    return null;
                }
                fast=fast.next;
            }
            while (fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            return slow.next;
        }
}
