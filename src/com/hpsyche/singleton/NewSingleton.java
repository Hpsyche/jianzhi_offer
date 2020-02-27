package com.hpsyche.singleton;

/**
 * @author hpsyche
 * Create on 2020/2/12
 */
public class NewSingleton {
    private NewSingleton(){}
    private static class SingletonHolder{
        private static NewSingleton instance=new NewSingleton();
    }
    public static NewSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
