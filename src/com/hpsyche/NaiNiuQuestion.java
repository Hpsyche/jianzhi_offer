package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class NaiNiuQuestion {
    public static int getNum(int n){
        if(n<=0){
            return -1;
        }
        int[] res=new int[]{1,2,3,4};
        if(n<=4){
            return res[n-1];
        }
        return getNum(n-1)+getNum(n-3);
    }

    public static void main(String[] args) {
        System.out.println(getNum(6));
    }
}
