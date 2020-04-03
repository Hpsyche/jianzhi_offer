package com.hpsyche.singleton;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class LazySingleton {
    private LazySingleton(){};
    private static LazySingleton instance=null;
    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
