package com.hpsyche.qianxin;

import java.util.Scanner;

/**
 * @author hpsyche
 * Create on 2020/2/28
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int in=scanner.nextInt();
        System.out.println(getNum(in));
    }

    private static int getNum(int in) {
        if(in<0){
            return 0;
        }
       int y1=1;
       int y2=1;
       int y3=1;
       int y4=1;
       int res=1;
       for(int i=5;i<=in;i++){
            res=y1+y4;
            y1=y2;
            y2=y3;
            y3=y4;
            y4=res;
       }
       return res;
    }
}
