package com.zhong.adapter.Adapter3;

/**
 * 建立一个抽象类  继承想要扩展的接口，注意：一定要实现所有方法，这样子类才能自由发挥
 */
public abstract class SourceableExtandAdapter implements ISourceable{

    // ISourceable中的所有方法都要继承
    public void method3() {}
    public void method4() {}

}
