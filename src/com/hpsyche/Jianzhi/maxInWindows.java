package com.hpsyche.Jianzhi;

import java.util.ArrayList;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 滑动窗口
 */
public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list  = new ArrayList<Integer> ();
        if(size>num.length||size==0)
            return list;
        for(int i = 0;i<=num.length-size;i++){
            int max = num[i];
            for(int j = i+1;j<i+size;j++){
                if(num[j]>max){
                    max = num[j];
                }
            }
            list.add(max);
        }
        return list;
    }
}
