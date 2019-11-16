package com.zhong.command;

/**
 * 命令，实现了Command接口，持有接收对象
 */
public class MyCommand implements ICommand {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
