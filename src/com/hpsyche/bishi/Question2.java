package com.hpsyche.bishi;

import java.util.Scanner;

/**
 * @author hpsyche
 * Create on 2020/2/19
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line=line.trim();
        String[] nums = line.split("\\s+");
        int num1=Integer.valueOf(nums[0]);
        int num2=Integer.valueOf(nums[1]);
        System.out.print(getMaxYueShu(num1,num2));
        System.out.print(" "+getMinBeiShu(num1,num2));
    }

    private static int getMinBeiShu(int num1, int num2) {
        return num1/getMaxYueShu(num1,num2)*num2;
    }

    private static int getMaxYueShu(int num1, int num2) {
        int min= Math.min(num1, num2);
        for(int i=min;i>=1;i--){
            if(num1%i==0&&num2%i==0){
                return i;
            }
        }
        return -1;
    }
}
