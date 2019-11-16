package com.zhong.observer;

/**
 * 具体观察者，实现抽象观察者定义的更新接口，以便在得到主题更改通知时更新自身的状态
 */
public class WeixinUser1 implements Observer {
    // 微信用户名
    private String name;
    public WeixinUser1(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
