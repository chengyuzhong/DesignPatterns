package com.zhong.proxy;

import com.zhong.proxy.ITicketService;

/**
 * 火车站售票处
 */
public class Station implements ITicketService {

    @Override
    public void sellTicket() {
        System.out.println("火车站在出票");
    }

    @Override
    public void Consultation() {
        System.out.println("火车站咨询处");
    }

    @Override
    public void ReturnTicket() {
        System.out.println("火车站在退票");
    }
}
