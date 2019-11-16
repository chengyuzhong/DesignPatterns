package com.zhong.strategy;

import java.math.BigDecimal;

/**
 * 计算会员折扣类,六折
 */
@PriceRegion(min = 10000, max = 20000)
public class MemberPrice implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal(0.6 + ""));
    }
}
