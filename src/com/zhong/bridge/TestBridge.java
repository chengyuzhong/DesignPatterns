package com.zhong.bridge;

/**
 * 桥接模式
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化。
 *
 * 抽象类中持有实现类的引用，并且含有set函数用于给用户设置这个抽象类的实现
 * 当给抽象类的对象设置完实现类对象之后，用户就可以通过抽象类的对象访问实现类对象中的函数及变量了
 */
public class TestBridge {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        bridge.setSourceable(new SourceSub1());
        bridge.method();

        bridge.setSourceable(new SourceSub2());
        bridge.method();
    }

}
