package com.zhong.strategy;

import java.math.BigDecimal;

/**
 * 抽象策略类：计算价格
 */
public interface Price {

    BigDecimal getPrice(BigDecimal price);

}
