package com.hpsyche.stringq;

import org.junit.Test;

import java.util.Stack;

/**
 * @author hpsyche
 * Create on 2020/3/7
 */
public class LengthestSubXulie {
    String lcs(String word1,String word2){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int size1=word1.length();
        int size2=word2.length();
        int dp[][]=new int[size1+1][size2+1];
        //第一行
        for(int i=0;i<size1;i++){
            dp[i][0]=0;
        }
        //第一列
        for(int i=0;i<size2;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=size1;i++) {
            for (int j = 1; j <= size2; j++) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int currI=size1;
        int currJ=size2;
        Stack<Character> stack=new Stack<>();
        while (currI>0&&currJ>0){
            //左
            if(dp[currI][currJ]==dp[currI-1][currJ]){
                currI--;
            }
            else if(dp[currI][currJ]==dp[currI][currJ-1]){
                currJ--;
            }
            else if(dp[currI][currJ]>dp[currI-1][currJ]-1){
                currI--;
                currJ--;
                stack.push(chars1[currI]);
            }
        }
        StringBuilder res=new StringBuilder("");
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }

    @Test
    public void test1(){
        System.out.println(lcs("aaabcb","aaabdca"));
    }
}
