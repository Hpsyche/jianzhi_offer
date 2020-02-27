package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 奇偶数
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            if(temp%2==1){
                for(int j=i;j>0;j--){
                    if(array[j-1]%2==0){
                        int t=array[j];
                        array[j]=array[j-1];
                        array[j-1]=t;
                    }
                }
            }
        }
    }
}
