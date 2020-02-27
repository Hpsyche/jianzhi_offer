package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 最大和
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum=array[0];
        int bestSum=array[0];
        for(int i=1;i<array.length;i++){
            sum=(sum<0)?array[i]:(sum+array[i]);
            bestSum= Math.max(sum, bestSum);
        }
        return bestSum;
    }
}
