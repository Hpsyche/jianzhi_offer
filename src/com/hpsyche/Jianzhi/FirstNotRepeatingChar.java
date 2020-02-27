package com.hpsyche.Jianzhi;

import java.util.HashMap;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 没有重复出现的字符
 *
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int value=map.get(str.charAt(i));
                map.put(str.charAt(i),value+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
