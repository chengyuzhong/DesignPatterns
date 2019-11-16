package com.zhong.template;

/**
 * 老板一天的流程（或算法）
 */
public class Employee extends Life {
    @Override
    public void work() {
        System.out.println("干活");
    }

    @Override
    public void goToWork() {
        System.out.println("坐公交去");
    }

    @Override
    public void goToHome() {
        System.out.println("坐公交回");
    }
}
