package com.zhong.template;

/**
 * 抽象类，为其他子类提供一个算法框架
 * 将所不变的行为搬到超类，去除子类中的重复代码，提供了一个很好了代码复用平台。
 * 缺点：当类的功能越来越多，变得复杂时，抽象类的管理和扩展就变得复杂
 */
public abstract class Life {

    private void getUp(){
        System.out.println("早上起床！");
    }

    /**
     * 钩子方法，子类可以不重写，默认不回家
     * （如果你期望一些方法在子类中不被重写，你可以让他们为 final）
     */
    public void goToHome() {
        System.out.println("默认不回家");
    }

    /**
     * 抽象方法，子类必须重写
     */
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
