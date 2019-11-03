package com.zhong.singleton;

/**
 * 饿汉式
 * 在类初始化时，已经自行实例化
 * 不管之后会不会使用这个单例，都会占据一定的内存
 */
public class Singleton4 {

    private static final Singleton4 INSTANCE = new Singleton4();

    private Singleton4(){}

    public static Singleton4 getInstance() {

        return INSTANCE;
    }

}
