package com.zhong.bridge;


public class MyBridge extends Bridge{

    public void method(){
        getSourceable().method();
    }

}
