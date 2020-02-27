package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/4
 * 到达最右下角的路径（带障碍）
 */
public class GetArravalPathWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;
        int[][] dp=new int[rows][cols];
        if(obstacleGrid[rows-1][cols-1]==1){
            return 0;
        }
        dp[rows-1][cols-1]=1;
        for(int i=cols-2;i>=0;i--){
            dp[rows-1][i]=(dp[rows-1][i+1]==0||obstacleGrid[rows-1][i]==1)?0:1;
        }
        for(int i=rows-2;i>=0;i--){
            dp[i][cols-1]=(dp[i+1][cols-1]==0||obstacleGrid[i][cols-1]==1)?0:1;
        }
        for(int o=rows-2;o>=0;o--){
            for(int i=cols-2;i>=0;i--){
                dp[o][i]=obstacleGrid[o][i]==1?0:dp[o+1][i]+dp[o][i+1];
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{
                {0,0,0},{0,1,0},{0,0,0},
        };
        System.out.println(uniquePathsWithObstacles(matrix));
    }
}
