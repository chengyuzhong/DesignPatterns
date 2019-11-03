package com.zhong.singleton;

/**
 * 懒汉式-双重检查锁定
 * 做了两次null检查，确保了只有第一次调用单例的时候才会做同步，这样也是线程安全的，同时避免了每次都同步的性能损耗
 */
public class Singleton2 {

    private static Singleton2 singleton = null;

    private Singleton2(){}

    public static Singleton2 getInstance() {
        if(singleton == null){
            synchronized (Singleton2.class){
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
            singleton = new Singleton2();
        }
        return singleton;
    }

}
