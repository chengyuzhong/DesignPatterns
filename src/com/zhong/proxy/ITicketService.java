package com.zhong.proxy;

/**
 * 售票服务的接口，它有售票咨询和退票的业务可以供客户选择
 */
public interface ITicketService {

    //售票
    void sellTicket();
    //咨询
    void Consultation();
    //退票
    void ReturnTicket();

}
