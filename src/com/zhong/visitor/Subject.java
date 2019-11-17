package com.zhong.visitor;

public interface Subject {

    /**
     * accept方法，接受将要访问它的对象
     * @param visitor
     */
    public void accept(Visitor visitor);


    public String getSubject();

}
