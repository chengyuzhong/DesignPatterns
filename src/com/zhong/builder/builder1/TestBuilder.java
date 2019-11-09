package com.zhong.builder.builder1;

/**
 * 建造者模式demo
 */
public class TestBuilder {
    public static void main(String[] args) {

        // 创建装机人员，并告诉他电脑配置为ComputerBuilderImpl，如果想要另一个配置，就告诉他另外一个实现类
        Director director = new Director(new ComputerBuilderImpl());

        // 开始组装电脑
        director.buildComputer();

        // 从组装人员那获取电脑对象
        Computer computer = director.getComputer();

        System.out.println(computer.toString());
    }
}
