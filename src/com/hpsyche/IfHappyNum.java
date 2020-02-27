package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class IfHappyNum {
    public static boolean ifHappy(int num){
        int slow=num;
        int fast=num;
        do{
            slow=getSum(slow);
            fast=getSum(fast);
            fast=getSum(fast);
        }while (slow!=fast);
        return fast==1;
    }
    public static int getSum(int num){
        int res=0;
        while (num!=0){
            res+=(num%10)*(num%10);
            num/=10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ifHappy(18));
    }
}
