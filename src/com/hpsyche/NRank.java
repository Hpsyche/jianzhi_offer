package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/3
 */
public class NRank {
    public static long getRank(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }

    public static long getRank2(int n){
        if(n==1){
            return 1;
        }
        return getRank2(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println(getRank(10));
        System.out.println(getRank2(10));
    }
}
