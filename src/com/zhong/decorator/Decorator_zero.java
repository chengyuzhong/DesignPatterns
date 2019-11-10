package com.zhong.decorator;


/**
 * 定义三种装饰，这是第一个，第二个第三个功能依次细化，即装饰者的功能越来越多
 *
 * 要点： 装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为
 *
 */
public class Decorator_zero extends Decorator {

    public Decorator_zero(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }

    public void goHome() {
        System.out.println("进房子。。");
    }

    public void findMap() {
        System.out.println("书房找找Map。。");
    }

}
