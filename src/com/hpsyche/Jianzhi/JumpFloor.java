package com.hpsyche.Jianzhi;

import org.junit.Test;

/**
 * @author hpsyche
 * Create on 2020/2/26
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int lastSum=2;
        int lastLastSum=1;
        for(int i=2;i<target;i++){
            int temp=lastSum;
            lastSum=lastSum+lastLastSum;
            lastLastSum=temp;
        }
        return lastSum;
    }
    @Test
    public void test1(){
        System.out.println(JumpFloor(3));
    }
}
