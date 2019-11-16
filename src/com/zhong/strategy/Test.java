package com.zhong.strategy;

import java.math.BigDecimal;

/**
 * 策略模式
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 *
 * 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 */
public class Test {

    public static void main(String[] args) throws Exception {
        PriceContext priceContext = new PriceContext();
        BigDecimal price = priceContext.getPrice(BigDecimal.TEN);
        System.out.println(price);
    }

}
