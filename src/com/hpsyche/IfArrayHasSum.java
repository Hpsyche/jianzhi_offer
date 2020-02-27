package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class IfArrayHasSum {
    public static boolean hasSum(int[] arr,int index,int sum,int aim){
        if(arr.length==index){
            return sum==aim;
        }
        return hasSum(arr,index+1,sum,aim)||hasSum(arr,index+1,sum+arr[index],aim);
    }

    public static boolean hasSum2(int[] arr,int index,int sum,int aim) {
        int all=0;
        for(int i:arr){
            all+=i;
        }
        if(all<aim){
            return false;
        }
        boolean[][] matrix=new boolean[arr.length+1][all+1];
        for(int i=0;i<=all;i++){
            matrix[arr.length][i]= i == aim;
        }
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=all;j++){
                if((j+arr[i])<=all) {
                    matrix[i][j] = (matrix[i + 1][j] || matrix[i + 1][j + arr[i]]);
                }else{
                    matrix[i][j] = matrix[i + 1][j];
                }
            }
        }
        return matrix[0][0];
    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,5,8,6};
        System.out.println(hasSum2(arr,0,0,14));
    }
}
