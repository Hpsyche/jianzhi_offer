package com.hpsyche.Jianzhi;

import com.hpsyche.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hpsyche
 * Create on 2020/2/25
 */
public class Question3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> resList=new ArrayList<>();
        getResList(resList,listNode);
        return resList;
    }
    private void getResList(List<Integer> list,ListNode listNode){
        if(listNode!=null){
            getResList(list,listNode.next);
            list.add(listNode.val);
        }
    }
}
