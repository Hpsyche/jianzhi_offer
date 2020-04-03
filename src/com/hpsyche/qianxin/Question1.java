package com.hpsyche.qianxin;

import java.util.Scanner;

/**
 * @author hpsyche
 * Create on 2020/2/28
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>991){
            System.out.println("1.000000");
        }
        double jianShu=1;
        for(int i=0;i<n;i++){
            jianShu*=(jianShu*(990-i)/(1000-i));
        }
        System.out.println(String.format("%.6d",jianShu));
    }
}
