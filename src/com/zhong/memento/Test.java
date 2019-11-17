package com.zhong.memento;

/**
 * 备忘录模式
 * 保存一个对象的某个状态，以便在适当的时候恢复对象
 * 辅助理解博客：https://blog.csdn.net/wwwdc1012/article/details/83353580
 */
public class Test {

    public static void main(String[] args) {

        // 原始类
        Original original = new Original("egg");

        // 创建备忘录 存储
        Storage storage = new Storage(original.createMemento());

        // 修改原始类的状态
        System.out.println("初始化状态为：" + original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为：" + original.getValue());

        // 恢复原始类的状态
        original.restoreMemento(storage.getMemento());

        System.out.println("恢复后的状态为：" + original.getValue());

    }

}
