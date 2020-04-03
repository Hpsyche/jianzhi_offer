package com.hpsyche.beibao;

import org.junit.Test;

/**
 * @author hpsyche
 * Create on 2020/3/27
 */
public class Question1 {
    public int getMax(int[] weight,int[] value,int total){
        int[][] dp=new int[weight.length+1][total+1];
        for(int i=1;i<weight.length;i++){
            for(int j=1;j<=total;j++){
                if(weight[i]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    int value1=dp[i-1][j-weight[i]]+value[i];
                    int value2=dp[i-1][j];
                    dp[i][j]=Math.max(value1,value2);
                }
            }
        }
        return dp[weight.length-1][total];
    }

    @Test
    public void test1(){
        System.out.println(getMax(new int[]{0,2,3,4,5,9},new int[]{0,3,4,5,8,10},20));
    }
}
