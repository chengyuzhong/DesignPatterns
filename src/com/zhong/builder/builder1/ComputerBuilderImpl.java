package com.zhong.builder.builder1;

/**
 * 具体的组装电脑的实现类，可以有多个实现类
 */
public class ComputerBuilderImpl implements IComputerBuilder{

    private Computer computer;

    public ComputerBuilderImpl(){
        this.computer = new Computer();
    }


    @Override
    public void buildCpu() {
        computer.setCpu("i5");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("128G");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("罗技m485");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("罗技k380");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }


}
