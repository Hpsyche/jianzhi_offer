package com.hpsyche.Jianzhi;

import java.util.Arrays;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 最小字符串
 */
public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        String[] str=new String[numbers.length];
        for(int i = 0; i < str.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, (s1, s2) -> {
            String c1 = s1 + s2;
            String c2 = s2 + s1;
            return c1.compareTo(c2);
        });
        StringBuilder sb=new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
