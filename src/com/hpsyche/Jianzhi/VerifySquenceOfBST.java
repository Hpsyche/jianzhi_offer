package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 是否后序遍历
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        if(sequence.length == 1){
            return true;
        }
        return judge(sequence,0,sequence.length-1);
    }

    private boolean judge(int[] sequence, int begin, int end) {
        if(begin>=end){
            return true;
        }
        int i=begin;
        while (sequence[i]<sequence[end]){
            i++;
        }
        for(int j=i;j<end;j++){
            if(sequence[j]<sequence[end]){
                return false;
            }
        }
        return judge(sequence,begin,i-1)&&judge(sequence,i,end-1);
    }
}
