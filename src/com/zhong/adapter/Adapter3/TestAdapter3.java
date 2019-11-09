package com.zhong.adapter.Adapter3;

/**
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类，实现所有方法，我们写别的类的时候，继承抽象类即可。
 */
public class TestAdapter3 {

    public static void main(String[] args) {

        // 类的适配器：IExtandSource具有了Source类的功能
        SourceableExtandAdapter ex = new SourceableExtand();
        ex.method4();
    }

}
