package com.zhong.decorator;

/**
 * 动态地将责任附加到对象上.若要扩展功能,装饰者提供了比继承更有弹性的替代方案
 *
 * 应用场景：
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * 缺点：产生过多相似的对象，不易排错！
 *
 *
 */
public class TestDecorator {

    public static void main(String[] args) {
        Human human = new Person();
        // Decorator de = new Decorator_two(human);
        Decorator de = new Decorator_two(new Decorator_first(new Decorator_zero(human)));

        de.walkToWhere();
        de.wearClothes();

    }

}
