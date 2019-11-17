package com.zhong.state;

/**
 * 状态模式
 * 用于解决系统中复杂对象的状态转换以及不同状态下行为的封装问题
 *
 * 参考博客：https://blog.csdn.net/qq_38526573/article/details/89345271
 */
public class Test {

    public static void main(String[] args) {
        HomeContext homeContext = new HomeContext();
        homeContext.setState(new FreeState());

//        homeContext.setState(new BookedState());
    }

}
