package com.hpsyche.deadLock;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author hpsyche
 * Create on 2020/2/16
 */
public class DeadLock1 extends Thread{
    private String a;
    private String b;
    public DeadLock1(String a,String b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void run() {
        synchronized (a){
            try {
                System.out.println(1);
                sleep(1000);
                synchronized (b){
                    System.out.println(2);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
//        String lockA="a";
//        String lockB="b";
//        Thread thread=new DeadLock1(lockA,lockB);
//        ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
//        threadLocal
//        System.out.println(thread.getThreadGroup());
//        System.out.println(thread.getThreadGroup().getName());
//        new DeadLock1(lockA,lockB).start();
//        new DeadLock1(lockB,lockA).start();
//        final DeadLock1 deadLock1=new DeadLock1("a","b");
//        deadLock1.a="555";
//        System.out.println(deadLock1.a);


        String str1=new String("a")+new String("b");
        String str2= str1.intern();
        System.out.println(str1==str2);
        String str3="ab";
        System.out.println(str1==str3);
    }
}
