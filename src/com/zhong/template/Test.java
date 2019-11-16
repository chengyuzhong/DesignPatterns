package com.zhong.template;

/**
 * 模板方法模式
 *
 */
public class Test {

    public static void main(String[] args) {
        Life boss = new Boss();
        boss.oneDay();

        System.out.println("--------------------");

        Life employee = new Employee();
        employee.oneDay();
    }

}
