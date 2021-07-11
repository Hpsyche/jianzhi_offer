package com.hpsyche.Jianzhi;

import org.junit.Test;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 逆序对
 */
public class InversePairs {
    public int InversePairs(int [] array) {
        if(array==null||array.length<2){
            return 0;
        }
        int[] copy=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return sortProcess(array,0,array.length-1);
    }

    private int sortProcess(int[] array, int L, int R) {
        if(L==R){
            return 0;
        }
        int mid=(L+R)>>1;
        int left=sortProcess(array,L,mid);
        int right=sortProcess(array,mid+1,R);
        return left+right+merge(array,L,mid,R);
    }

    //4 2 1 5 3
    private int merge(int[] array, int l, int mid, int r) {
        int count=0;
        int[] resArr=new int[r-l+1];
        int point=0;
        int p1=l;
        int p2=mid+1;
        while (p1<=mid&&p2<=r){
            if(array[p1]>array[p2]){
                count+=(mid-p1+1);
            }
            resArr[point++]=array[p1]<=array[p2]?array[p1++]:array[p2++];
        }
        while (p1<=mid){
            resArr[point++]=array[p1++];
        }
        while (p2<=r){
            resArr[point++]=array[p2++];
        }
        for(point=0;point<resArr.length;point++){
            array[l+point]=resArr[point];
        }
        return count;
    }

    @Test
    public void test1(){
        int i = InversePairs(new int[]{1, 3, 2, 3, 1});
        System.out.println(i);
    }
}
