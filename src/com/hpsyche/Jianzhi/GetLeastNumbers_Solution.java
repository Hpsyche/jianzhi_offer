package com.hpsyche.Jianzhi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 最小的k个数
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(k>input.length||k==0){
            return result;
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int value : input) {
            if (maxHeap.size() != k) {
                maxHeap.add(value);
            } else if (maxHeap.peek() > value) {
                maxHeap.poll();
                maxHeap.add(value);
            }
        }
        return new ArrayList<>(maxHeap);
    }
}
