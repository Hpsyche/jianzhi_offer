package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class GetArravalPaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[m-1][n-1]=1;
        for(int i=n-2;i>=0;i--){
            dp[m-1][i]=1;
        }
        for(int i=m-2;i>=0;i--){
            dp[i][n-1]=1;
        }
        for(int o=m-2;o>=0;o--){
            for(int i=n-2;i>=0;i--){
                dp[o][i]=dp[o+1][i]+dp[o][i+1];
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}
