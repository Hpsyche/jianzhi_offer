package com.hpsyche.Jianzhi;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 大顶堆用来存较小的数，从大到小排列；
 * 小顶堆存较大的数，从小到大的顺序排序；
 * 显然中位数就是大顶堆的根节点与小顶堆的根节点和的平均数。
 *
 * ⭐当数目为偶数的时候，将这个值插入大顶堆中，再将大顶堆中根节点（即最大值）插入到小顶堆中；
 * ⭐当数目为奇数的时候，将这个值插入小顶堆中，再讲小顶堆中根节点（即最小值）插入到大顶堆中；
 * ⭐取中位数的时候，如果当前个数为偶数，显然是取小顶堆和大顶堆根结点的平均值；
 * 如果当前个数为奇数，显然是取小顶堆的根节点
 * 中位数
 */
public class MidNum {
    //小顶堆
    private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    //大顶堆
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    //记录偶数个还是奇数个
    int count = 0;
    //每次插入小顶堆的是当前大顶堆中最大的数
    //每次插入大顶堆的是当前小顶堆中最小的数
    //这样保证小顶堆中的数永远大于等于大顶堆中的数
    //中位数就可以方便地从两者的根结点中获取了
    public void Insert(Integer num) {
        //个数为偶数的话，则先插入到大顶堆，然后将大顶堆中最大的数插入小顶堆中
        if(count % 2 == 0){
            maxHeap.offer(num);
            int max = maxHeap.poll();
            minHeap.offer(max);
        }else{
            //个数为奇数的话，则先插入到小顶堆，然后将小顶堆中最小的数插入大顶堆中
            minHeap.offer(num);
            int min = minHeap.poll();
            maxHeap.offer(min);
        }
        count++;
    }
    public Double GetMedian() {
        //当前为偶数个，则取小顶堆和大顶堆的堆顶元素求平均
        if(count % 2 == 0){
            return new Double(minHeap.peek() + maxHeap.peek())/2;
        }else{
            //当前为奇数个，则直接从小顶堆中取元素即可
            return new Double(minHeap.peek());
        }
    }
}
