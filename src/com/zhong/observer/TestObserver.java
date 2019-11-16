package com.zhong.observer;

/**
 * 观察者模式又称为发布-订阅模式
 * 定义了对象之间的一对多依赖，这样一来，当对象改变状态时，它的所有依赖者都会收到通知并自动更新。
 * 多用于实现订阅功能的场景，例如微博的订阅，当我们订阅了某个人的微博账号，当这个人发布了新的消息，就会通知我们。
 * 参考博客：https://blog.csdn.net/itachi85/article/details/50773358
 */
public class TestObserver {

    public static void main(String[] args) {

        //创建微信用户
        WeixinUser1 user1=new WeixinUser1("杨影枫");
        WeixinUser1 user2=new WeixinUser1("月眉儿");
        WeixinUser1 user3=new WeixinUser1("紫轩");

        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();

        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);

        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("刘望舒的专栏更新了");
    }

}
