package com.zhong.adapter.Adapter1;


import com.zhong.adapter.Source;

public class ExtandSourceImpl extends Source implements IExtandSource{


    @Override
    public void method2() {
        System.out.println("这是本实现类自有的方法");
    }


}
