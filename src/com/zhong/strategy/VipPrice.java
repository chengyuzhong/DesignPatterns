package com.zhong.strategy;

import java.math.BigDecimal;

/**
 * 计算超级会员折扣类,超级会员,4折
 */
@PriceRegion(max = 20000)
public class VipPrice implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal(0.4+""));
    }
}
