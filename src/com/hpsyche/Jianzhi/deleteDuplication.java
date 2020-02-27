package com.hpsyche.Jianzhi;

import com.hpsyche.utils.ListNode;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 删除排序链表中的重复的节点
 *
 * 1. 首先添加一个头节点，以方便碰到第一个，第二个节点就相同的情况
 * 2.设置 pre ，last 指针， pre指针指向当前确定不重复的那个节点，而last指针相当于工作指针，一直往后面搜索。
 */
public class deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead==null || pHead.next==null){return pHead;}
        ListNode Head = new ListNode(0);
        Head.next = pHead;
        ListNode pre  = Head;
        ListNode last = Head.next;
        while (last!=null){
            if(last.next!=null && last.val == last.next.val){
                // 找到最后的一个相同节点
                while (last.next!=null && last.val == last.next.val){
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            }else{
                pre = pre.next;
                last = last.next;
            }
        }
        return Head.next;
    }
}
