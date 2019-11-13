package com.zhong.bridge;

/**
 * 定义一个桥，持有Sourceable的一个实例
 */
public abstract class Bridge {

    private Sourceable sourceable;

    public void method() {
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
