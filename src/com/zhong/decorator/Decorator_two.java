package com.zhong.decorator;

public class Decorator_two extends Decorator {

    public Decorator_two(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTheTarget();
    }


    public void findClothes() {
        System.out.println("找到一件XX。。");
    }

    public void findTheTarget() {
        System.out.println("在Map上找到神秘花园和城堡。。");
    }


}
