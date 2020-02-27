package com.hpsyche.sort;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class HeapSort {
    public static void heapSort(int[] array){
        for(int i=0;i<array.length;i++){
            buildHeap(array,i);
        }
        int heapSize=array.length;
        while (heapSize>0){
            swap(array,0,--heapSize);
            heapify(array,0,heapSize);
        }
    }

    private static void heapify(int[] array, int i, int heapSize) {
        int left=i*2+1;
        while(left<heapSize){
            int large=left+1<heapSize&&array[left+1]>array[left]?left+1:left;
            large=array[large]>array[i]?large:i;
            if(large==i){
                break;
            }
            swap(array,large,i);
            i=large;
            left=i*2+1;
        }
    }

    private static void buildHeap(int[] array, int i) {
        while(array[i]>array[(i-1)/2]){
            swap(array,i,(i-1)/2);
            i=(i-1)/2;
        }
    }

    private static void swap(int[] array, int i, int i1) {
        int temp=array[i];
        array[i]=array[i1];
        array[i1]=temp;
    }

}
