package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 最小数
 */
public class RotateArrayMinNum {
    public int minNumberInRotateArray(int [] array) {
        int low=0;
        int high=array.length-1;
        while(low<high){
            int mid=(low+high)>>1;
            if(array[mid]>array[high]){
                low=mid+1;
            }else if(array[mid]<array[high]){
                high=mid;
            }else{
                high=high-1;
            }
        }
        return array[low];
    }
}
