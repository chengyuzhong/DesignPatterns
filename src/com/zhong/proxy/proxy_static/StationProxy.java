package com.zhong.proxy.proxy_static;

import com.zhong.proxy.ITicketService;

/**
 * 代理售票点
 */
public class StationProxy implements ITicketService {

    private ITicketService station;

    public StationProxy(ITicketService station){
        this.station = station;
    }

    @Override
    public void sellTicket() {
        System.out.println("欢迎使用车票代售点进行购票，每张票将会收取5元手续费！");
        station.sellTicket();
        System.out.println("欢迎下次光临");
        System.out.println();
    }

    @Override
    public void Consultation() {
        System.out.println("欢迎咨询，咨询不收取费用");
        station.Consultation();
        System.out.println("欢迎下次光临");
        System.out.println();
    }

    @Override
    public void ReturnTicket() {
        System.out.println("欢迎使用车票代售点进行退票，每张票将会收取5元手续费！");
        station.ReturnTicket();
        System.out.println("欢迎下次光临");
        System.out.println();
    }
}
