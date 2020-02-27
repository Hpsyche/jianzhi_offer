package com.hpsyche.sort;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class MergeSort {
    public static void mergeSort(int[] array,int l,int r){
        if(l<r){
            int mid=(r+l)>>1;
            mergeSort(array,l,mid);
            mergeSort(array,mid+1,r);
            merge(array,l,mid,r);
        }
    }

    private static void merge(int[] array, int l, int mid,int r) {
        int[] temp=new int[r-l+1];
        int curr=0;
        int p1=l;
        int p2=mid+1;
        while (p1<=mid&&p2<=r){
            temp[curr++]=array[p1]<array[p2]?array[p1++]:array[p2++];
        }
        while (p1<=mid){
            temp[curr++]=array[p1++];
        }
        while (p2<=r){
            temp[curr++]=array[p2++];
        }
        for(int i=0;i<temp.length;i++){
            array[l+i]=temp[curr];
        }
    }
}
