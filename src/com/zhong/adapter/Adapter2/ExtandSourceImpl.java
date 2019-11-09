package com.zhong.adapter.Adapter2;


import com.zhong.adapter.Source;

public class ExtandSourceImpl implements IExtandSource {

    // 不继承Source类，而是持有Source类的实例
    private Source source;

    public ExtandSourceImpl (Source source){
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("这是本实现类自有的方法");
    }


}
