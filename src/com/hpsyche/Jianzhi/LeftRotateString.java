package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/27
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        char[] chars = str.toCharArray();
        for(int i=0,j=n-1;i<j;i++,j--){
            swap(chars,i,j);
        }
        for(int i=n,j=chars.length-1;i<j;i++,j--){
            swap(chars,i,j);
        }
        for(int i=0,j=chars.length-1;i<j;i++,j--){
            swap(chars,i,j);
        }
        return String.valueOf(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }
}
