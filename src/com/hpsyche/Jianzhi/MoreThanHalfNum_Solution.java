package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 超过一半的数字
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int result=array[0];
        int times=1;
        for(int i=1;i<array.length;i++){
            if(times==0){
                result=array[i];
                times=1;
            }else if(array[i]==result){
                times++;
            }else{
                times--;
            }
        }
        times=0;
        for (int value : array) {
            if (value == result) {
                times++;
            }
        }
        return times>(array.length/2)?result:0;
    }
}
