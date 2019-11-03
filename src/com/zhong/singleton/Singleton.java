package com.zhong.singleton;

/**
 * 懒汉式-线程不安全
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton(){}

    public static Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
