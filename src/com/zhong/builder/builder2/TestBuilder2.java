package com.zhong.builder.builder2;

/**
 * 建造者模式
 */
public class TestBuilder2 {
    public static void main(String[] args) {

        Person p = new Person.Builder("张三", "男")
                .age("12").car("宝马").build();
    }
}
