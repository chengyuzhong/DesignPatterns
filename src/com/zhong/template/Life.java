package com.zhong.template;

/**
 * 抽象基类，为其他子类提供一个算法框架
 * 将所不变的行为搬到超类，去除子类中的重复代码，提供了一个很好了代码复用平台。
 * 缺点：当类的功能越来越多，变得复杂时，抽象类的管理和扩展就变得复杂
 */
public abstract class Life {

    private void getUp(){
        System.out.println("早上起床！");
    }

    public void goToHome() {
    }

    public abstract void work();

    public void goToWork() {
    }

    /** 封装了所有子类所遵循的算法框架 **/
    public void oneDay(){
        getUp();
        goToWork();
        work();
        goToHome();
    }


}
