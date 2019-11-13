package com.zhong.facade;

/**
 * 外观类
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA(){
        one.methodOne();
        two.methodTwo();
        three.methodThree();
    }

    public void methodB(){
        one.methodOne();
        two.methodTwo();
        three.methodThree();
        four.methodFour();
    }
}