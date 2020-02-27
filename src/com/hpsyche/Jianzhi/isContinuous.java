package com.hpsyche.Jianzhi;

import java.util.HashSet;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 判断是否顺子
 */
public class isContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length < 5)
            return false;
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        int min = 14;
        for (int i : numbers) {
            if(i != 0) {
                max = Math.max(i, max);
                min = Math.min(i, min);
                if(!set.add(i))      //判断是否有非0重复元素,一旦有重复就false
                    return false;
            }         }
        return max - min <= 4;//在没有重复元素的情况下，max-min小于4一定是顺子            }
    }
}
