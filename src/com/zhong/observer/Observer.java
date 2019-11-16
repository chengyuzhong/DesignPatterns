package com.zhong.observer;

/**
 * 观察者，可以接收到主题的更新。它定义了一个更新接口，使得在得到主题更改通知时更新自己
 */
public interface Observer {

    public void update(String message);

}
