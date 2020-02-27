package com.hpsyche.sort;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class QuickSort {
    public static void quickSort(int[] arr,int L,int R){
        if(L<R){
            swap(arr,(int)(L+(R-L+1)*Math.random()),R);
            //返回：arr0：相等数的左下标，arr1：相等数的右下标
            int[] i=paration(arr,L,R);
            quickSort(arr,L,i[0]-1);
            quickSort(arr,i[1],R);
        }
    }

    private static int[] paration(int[] arr, int l, int r) {
        // 4 6 2 1 3
        //
        //比arr[r]小的数的区间
        int less=l-1;
        //比arr[r]大的数的区间
        int more=r;
        while(l<more){
            if(arr[l]<arr[r]){
                swap(arr,l++,++less);
            }
            if(arr[l]>arr[r]){
                swap(arr,--more,l);
            }else{
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }

    public static int[] quickSort2(int[] array,int l,int r){
        if(l<r){
            int i=l;
            int j=r;
            int x=array[l];
            while(i<j){
                //从右往左找第一个小于x的
                while(i<j&&array[j]>=x){
                    j--;
                }
                //防止没找到
                if(i<j){
                    array[i]=array[j];
                }
                //从左往右找第一个大于等于x的
                while (i<j&&array[i]<x){
                    i++;
                }
                if(i<j){
                    array[j]=array[i];
                }
            }
            array[i]=x;
            quickSort(array,l,i-1);
            quickSort(array,i+1,r);
        }
        return array;
    }


    private static void swap(int[] arr, int v, int r) {
        int temp=arr[v];
        arr[v]=arr[r];
        arr[r]=temp;
    }
}
