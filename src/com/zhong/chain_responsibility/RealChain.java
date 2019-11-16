package com.zhong.chain_responsibility;

import java.util.List;

/**
 * 类描述：实现Chain的真正的包装Request和转发功能
 *
 * @author lzy
 *
 */
public class RealChain implements IdealRequest.Chain {
    public Request request;
    public List<IdealRequest> dealList;
    public int index;

    /**
     * 构造方法
     *
     * @param ratifyList
     *            Ratify接口的实现类集合
     * @param request
     *            具体的请求Request实例
     * @param index
     *            已经处理过该request的责任人数量
     */
    public RealChain(List<IdealRequest> dealList, Request request, int index) {
        this.dealList = dealList;
        this.request = request;
        this.index = index;
    }

    /**
     * 方法描述：具体转发功能
     */
    @Override
    public Result proceed(Request request) {
        Result proceed = null;
        if (dealList.size() > index) {
            RealChain realChain = new RealChain(dealList, request, index + 1);
            IdealRequest deal = dealList.get(index);
            proceed = deal.deal(realChain);
        }

        return proceed;
    }

    /**
     * 方法描述：返回当前Request对象或者返回当前进行包装后的Request对象
     */
    @Override
    public Request request() {
        return request;
    }

}