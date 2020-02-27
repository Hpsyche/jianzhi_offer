package com.hpsyche.bishi;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author hpsyche
 * Create on 2020/2/27
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(4);
        minHeap.add(2);
        minHeap.add(1);
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());
    }
}
