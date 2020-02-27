package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 矩阵
 */
public class RectCover {
    public int RectCover(int target) {
        if(target<1){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
}