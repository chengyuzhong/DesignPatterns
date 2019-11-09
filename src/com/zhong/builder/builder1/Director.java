package com.zhong.builder.builder1;

/**
 * 装机人员Director
 */
public class Director {
    private IComputerBuilder computerBuilder;

    public Director(IComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer(){
        computerBuilder.buildCpu();
        computerBuilder.buildDisk();
        computerBuilder.buildMouse();
        computerBuilder.buildKeyboard();
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }
}
