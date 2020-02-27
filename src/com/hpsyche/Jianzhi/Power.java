package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * n次方
 */
public class Power {
    public double Power(double base, int exponent) {
        if(exponent==0){
            return 1;
        }
        if(exponent>0){
            double sum=base;
            for(int i=1;i<exponent;i++){
                sum*=base;
            }
            return sum;
        }
        double sum=base;
        int flag=-exponent;
        for(int i=1;i<flag;i++){
            sum*=base;
        }
        return 1/sum;
    }
}
