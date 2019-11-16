package com.zhong.command;

/**
 * 调用者（司令员）
 */
public class Invoker {

    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
