package com.zhong.mediator;

/**
 * 中介者模式
 *
 * 使用中介者模式，类A类B之间则不可以直接关联，他们之间必须要通过一个中介者来达到关联的目的
 * 以避免同事类之间的过度耦合，使得各同事类之间可以相对独立地使用
 *
 * 参考博客：https://blog.csdn.net/zhengzhb/article/details/7430098
 *
 */
public class Test {

    public static void main(String[] args) {
        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();

        AbstractMediator am = new Mediator(collA, collB);

        System.out.println("==========通过设置A影响B==========");
        collA.setNumber(1000, am);
        System.out.println("collA的number值为："+collA.getNumber());
        System.out.println("collB的number值为A的10倍："+collB.getNumber());


        System.out.println("==========通过设置B影响A==========");
        collB.setNumber(1000, am);
        System.out.println("collB的number值为："+collB.getNumber());
        System.out.println("collA的number值为B的0.1倍："+collA.getNumber());


    }

}
