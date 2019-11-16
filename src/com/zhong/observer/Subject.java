package com.zhong.observer;

/**
 * Observable
 * 即被观察者，也可以被叫做主题（Subject）是被观察的对象。通常有注册方法（register），取消注册方法(remove)和通知方法(notify)。
 */
public interface Subject {

    /**
     * 增加订阅者
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * 删除订阅者
     * @param observer
     */
    public void detach(Observer observer);
    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);
}
