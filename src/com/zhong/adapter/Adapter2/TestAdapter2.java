package com.zhong.adapter.Adapter2;

import com.zhong.adapter.Source;

/**
 * 对象的适配器：对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 * 不继承Source类，而是持有Source类的实例
 */
public class TestAdapter2 {

    public static void main(String[] args) {

        // 类的适配器：IExtandSource具有了Source类的功能
        IExtandSource ex = new ExtandSourceImpl(new Source());
        ex.method1();
        ex.method2();
    }

}
