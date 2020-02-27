package com.hpsyche.Jianzhi;

import java.util.LinkedList;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 约瑟夫环问题
 */
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int bt=0;
        while (list.size()>1){
            bt=(bt+m-1)%list.size();
            list.remove(bt);
        }
        return list.get(0);
    }
}
