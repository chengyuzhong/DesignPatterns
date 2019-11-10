package com.zhong.proxy.proxy_static;

import com.zhong.proxy.ITicketService;

/**
 * 静态代理：代理类与被代理类的依赖关系在编译期间就确定了
 */
public class TestProxy {

    /**
     * 去代理点完成购买车票
     */
    public static void main(String[] args) {

        ITicketService proxy = ProxyFactory.getProxy();

        proxy.Consultation();
        proxy.sellTicket();
        proxy.ReturnTicket();

    }

}
