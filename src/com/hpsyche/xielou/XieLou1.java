package com.hpsyche.xielou;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class XieLou1 {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<>();
        Object o=new Object();
        WeakReference<Object> weakReference=new WeakReference<Object>(o);
        list.add(weakReference);
        o=null;
        for(Object o1:list){
            System.out.println(o1);
        }
    }
}
