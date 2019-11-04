package com.zhong.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Java中默认是的克隆模式是浅层克隆，不复制引用变量所对应的对象。那么对于深层次的克隆，需要编写对应代码来复制
 *
 * 原型模式复制对象时不会调用类的构造方法，所以原型模式无法和单例模式组合使用，因为原型类需要将clone方法的作用域修改为public类型，
 * 单例模式中，只要将构造方法的访问权限设置为private型
 */
public class TestProtoType {

    public static void main(String[] args) {
        //创建对象person1
        Person person1 = new Person();
        //初始化对象
        person1.setName("zhangsan");
        person1.setAge(20);
        List<String> friends = new ArrayList<String>();
        friends.add("lisi");
        friends.add("wangwu");
        person1.setFriends(friends);

        //person2是浅层克隆
        Person person2 = person1.shallowClone();
        //person3是深层克隆
        Person person3 = person1.deepClone();

        //获取浅层克隆的friends的list对象
        List<String> person2_friends = person2.getFriends();
        //向引用对象中添加值
        person2_friends.add("shallow");
        person2.setFriends(person2_friends);
        //获取深层克隆的friends的list对象
        List<String> person3_friends = person3.getFriends();
        //向引用对象中添加值
        person3_friends.add("deep");
        person3.setFriends(person3_friends);

        System.out.println("原型："+person1);
        System.out.println("浅层克隆："+person2);
        System.out.println("深层克隆："+person3);
    }


}
