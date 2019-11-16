package com.zhong.chain_responsibility;

/**
 * 定义接口用于处理Request和获取请求结果Result
 */
public interface IdealRequest {

    // 处理请求
    public Result deal(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        // 获取当前request
        Request request();

        // 转发request
        Result proceed(Request request);
    }

}
