package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/4
 */
public class AllSortStrings {
    public static void print(char[] str,int outerIndex,int length){
        if(outerIndex==length-1){
            System.out.println(str);
        }else {
            for(int inner=outerIndex;inner<length;inner++){
                swap(str,outerIndex,inner);
                print(str,outerIndex+1,length);
                //记得交换回来
                swap(str,outerIndex,inner);
            }
        }
    }

    private static void swap(char[] str, int outerIndex, int inner) {
        char temp=str[outerIndex];
        str[outerIndex]=str[inner];
        str[inner]=temp;
    }

    public static void main(String[] args) {
        print("abcd".toCharArray(),0,4);
    }
}
