package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 数组中重复的数字
 */
public class duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i=0;i<length;i++){
            int index=numbers[i];
            if(index>=length){
                index-=length;
            }
            if(numbers[index]>=length){
                duplication[0]=index;
                return true;
            }
            numbers[index]+=length;
        }
        return false;
    }
}
