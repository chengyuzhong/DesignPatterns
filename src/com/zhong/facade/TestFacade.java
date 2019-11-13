package com.zhong.facade;

/**
 * 外观模式
 * 为了让外部减少与子系统内多个模块的交互，松散耦合，从而让外部能够更简单的使用子系统
 */
public class TestFacade {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

}
