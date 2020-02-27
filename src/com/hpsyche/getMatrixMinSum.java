package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class getMatrixMinSum {
    public static int getMin(int[][] matrix,int i,int j){
        if(i==matrix.length-1&&j==matrix[0].length-1){
            return matrix[i][j];
        }
        if(i==matrix.length-1){
            return matrix[i][j]+getMin(matrix,i,j+1);
        }
        if(j==matrix[0].length-1){
            return matrix[i][j]+getMin(matrix,i+1,j);
        }
        return matrix[i][j]+Math.min(getMin(matrix,i+1,j),getMin(matrix,i,j+1));
    }

    public static int getMinWithDp(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] dp=new int[rows][cols];
        dp[rows-1][cols-1]=matrix[rows-1][cols-1];
        for(int k=cols-2;k>=0;k--){
            dp[rows-1][k]=matrix[rows-1][k]+dp[rows-1][k+1];
        }
        for(int k=rows-2;k>=0;k--){
            dp[k][cols-1]=matrix[k][cols-1]+dp[k+1][cols-1];
        }
        for(int m=rows-2;m>=0;m--){
            for(int n=cols-2;n>=0;n--){
                dp[m][n]=matrix[m][n]+Math.min(dp[m+1][n],dp[m][n+1]);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{
                {5,2,1,0},
                {7,4,0,1},
                {8,5,2,2}
        };
//        System.out.println(getMin(matrix,0,0));
        System.out.println(getMinWithDp(matrix));

    }
}
