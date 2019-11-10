package com.zhong.proxy.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类（实现invocationHandle接口,并重写invoke（代理类，被代理的方法，方法的参数列表）方法）
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;//被代理的对象

    public DynamicProxy(Object obj){
        this.target=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("购票进展："+method.getName());
        Object invokeResult = method.invoke(target, args);
        System.out.println();
        return invokeResult;
    }

}
