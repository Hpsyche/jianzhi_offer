package com.hpsyche.Jianzhi;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 全排列
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res=new ArrayList<>();
        if(str!=null||str.length()>0){
            PermutationHelper(str.toCharArray(),0,res);
            Collections.sort(res);
        }
        return res;
    }

    private void PermutationHelper(char[] toCharArray, int i, ArrayList<String> res) {
        if(i==toCharArray.length-1){
            String value = String.valueOf(toCharArray);
            if(!res.contains(value)){
                res.add(value);
            }
        }else{
            for(int j=i;j<toCharArray.length;j++){
                swap(toCharArray,i,j);
                PermutationHelper(toCharArray,i+1,res);
                swap(toCharArray,i,j);
            }
        }
    }

    private void swap(char[] toCharArray, int i, int j) {
        char temp=toCharArray[i];
        toCharArray[i]=toCharArray[j];
        toCharArray[j]=temp;
    }
}
