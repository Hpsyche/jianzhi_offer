package com.hpsyche.singleton;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){}
    private static volatile DoubleCheckSingleton instance=null;
    public static DoubleCheckSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckSingleton.class){
                if(instance==null){
                    instance=new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
