package com.hpsyche.singleton;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class EagerSingleton {
    private EagerSingleton(){}
    private static EagerSingleton instance=new EagerSingleton();
    public static EagerSingleton getInstance(){
        return instance;
    }
}
