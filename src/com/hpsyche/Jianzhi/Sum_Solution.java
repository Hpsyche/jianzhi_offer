package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 求和
 */
public class Sum_Solution {
    public int Sum_Solution(int n) {
        int ans=n;
        boolean i=(ans!=0)&&((ans+=Sum_Solution(n-1))!=0);
        return ans;
    }
}
