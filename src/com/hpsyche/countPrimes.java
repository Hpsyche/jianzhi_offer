package com.hpsyche;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class countPrimes {
    public static int countPrimes(int n) {
        boolean[] flag=new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(!flag[i]){
                count++;
                for(int j=i+i;j<n;j+=i){
                    flag[j]=true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(67));
    }

}
