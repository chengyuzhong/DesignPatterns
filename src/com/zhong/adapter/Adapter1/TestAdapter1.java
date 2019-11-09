package com.zhong.adapter.Adapter1;

/**
 * 类的适配器：将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题
 */
public class TestAdapter1 {

    public static void main(String[] args) {

        // 类的适配器：IExtandSource具有了Source类的功能
        IExtandSource ex = new ExtandSourceImpl();
        ex.method1();
        ex.method2();
    }

}
