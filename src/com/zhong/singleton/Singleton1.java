package com.zhong.singleton;

/**
 * 懒汉式-在getInstance方法上加同步
 * 虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的
 */
public class Singleton1 {

    private static Singleton1 singleton = null;

    private Singleton1(){}

    public synchronized static Singleton1 getInstance() {
        if(singleton == null){
            singleton = new Singleton1();
        }
        return singleton;
    }

}
