package com.zhong.builder;

/**
 * 抽象的电脑组装过程的Builder类
 */
public interface IComputerBuilder {

    void buildCpu();

    void buildDisk();

    void buildMouse();

    void buildKeyboard();

    Computer getComputer();
}
