package com.zhong.command;

/**
 * 命令模式
 * 达到命令的发出者和执行者之间解耦，实现请求和执行分开
 *
 */
public class TestCommand {

    public static void main(String[] args) {

        // 创建士兵
        Receiver receiver = new Receiver();

        // 命令对象
        ICommand command = new MyCommand(receiver);

        // 司令执行命令
        Invoker invoker = new Invoker(command);
        invoker.action();


    }

}
