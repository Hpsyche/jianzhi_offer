package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/3
 */
public class PrintAllSonStrings {
    public static void print(String s,int index,String curr){
        if(index==s.length()){
            System.out.println(curr);
            return;
        }
        print(s,index+1,curr);
        print(s,index+1,curr+s.charAt(index));

    }

    public static void main(String[] args) {
        print("abc",0,"");
    }
}
