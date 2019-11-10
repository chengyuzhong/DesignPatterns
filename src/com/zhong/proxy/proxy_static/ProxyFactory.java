package com.zhong.proxy.proxy_static;

import com.zhong.proxy.ITicketService;
import com.zhong.proxy.Station;

/**
 * 产生代理对象的静态代理工厂类，也可不产生
 */
public class ProxyFactory {

    public static ITicketService getProxy(){
        return new StationProxy(new Station());
    }

}
