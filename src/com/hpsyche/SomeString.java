package com.hpsyche;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hpsyche
 * Create on 2019/12/9
 */
public class SomeString {
    public static boolean isIsomorphic(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Map<Character,Character> map=new HashMap<Character, Character>(char1.length);
        for(int i=0;i<char1.length;i++){
            if(!map.containsKey(char1[i])){
                if(map.containsValue(char2[i])){
                    return false;
                }
                map.put(char1[i],char2[i]);
            }else{
                if(map.get(char1[i])!=char2[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
}
