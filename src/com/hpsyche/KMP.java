package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/25
 */
public class KMP {
    public static int getIndexOf(String s,String m){
        if(s==null||m==null||m.length()<1||s.length()<m.length()){
            return -1;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = m.toCharArray();
        int i1=0;
        int i2=0;
        int[] next=getNextArray(str2);
        while(i1<str1.length&&i2<str2.length){
            if(str1[i1]==str2[i2]){
                i1++;
                i2++;
            }else if(next[i2]==-1){
                i1++;
            }else{
                i2=next[i2];
            }
        }
        return i2==str2.length?i1-i2:-1;
    }

    //abcabcd
    //-1 0 1 2 3

    private static int[] getNextArray(char[] str2) {
        if(str2.length==1){
            return new int[]{-1};
        }
        int[] next=new int[str2.length];
        next[0]=-1;
        next[1]=0;
        int curr=2;
        //初始化cn为0
        int cn=0;
        //abcababcabg
        //-1 0 0 0 1 2 1 2 3 4 “2”
        while (curr<str2.length){
            if(str2[curr-1]==str2[cn]){
                next[curr++]=++cn;
            }else if(cn>0){
                cn=next[cn];
            }else{
                next[curr++]=0;
            }
        }
        return next;
    }
}
