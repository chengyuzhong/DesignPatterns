package com.zhong.singleton;

/**
 * 懒汉式-静态内部类
 * 利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗  推荐使用
 */
public class Singleton3 {

    private static class LazyHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }


    private Singleton3(){}

    public static Singleton3 getInstance() {

        return LazyHolder.INSTANCE;
    }

}
