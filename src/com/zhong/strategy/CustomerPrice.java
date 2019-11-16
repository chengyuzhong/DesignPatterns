package com.zhong.strategy;

import java.math.BigDecimal;

/**
 * 计算顾客折扣类,不打折
 */
@PriceRegion(max = 10000)
public class CustomerPrice implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price;
    }
}
