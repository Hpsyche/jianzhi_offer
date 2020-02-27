package com.hpsyche.Jianzhi;

import com.hpsyche.utils.RandomListNode;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 随机克隆
 */
public class CloneRandomList {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null){
            return null;
        }
        RandomListNode currNode=pHead;
        //1.复制每个节点，插到当前节点的后面
        while(currNode!=null){
            RandomListNode clone=new RandomListNode(currNode.label);
            RandomListNode nextNode=currNode.next;
            currNode.next=clone;
            clone.next=nextNode;
            currNode=nextNode;
        }
        //2.复制原节点的随机指针
        currNode=pHead;
        while(currNode!=null){
            currNode.next.random=currNode.random==null?null:currNode.random.next;
            currNode=currNode.next.next;
        }
        //3.拆分链表
        currNode=pHead;
        RandomListNode pCloneHead=currNode.next;
        while (currNode!=null){
            RandomListNode cloneNode=currNode.next;
            currNode.next=cloneNode.next;
            cloneNode.next=cloneNode.next==null?null:cloneNode.next.next;
            currNode=currNode.next;
        }
        return pCloneHead;
    }
}
