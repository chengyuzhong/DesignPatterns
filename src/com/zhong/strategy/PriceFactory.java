package com.zhong.strategy;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PriceFactory {

    private static final PriceFactory FACTORY = new PriceFactory();

    private List<Class<? extends Price>> priceList = new ArrayList<>();

    private PriceFactory() {
        //这边是可以改造成自动获取文件路径的哈
        priceList.add(MemberPrice.class);
        priceList.add(CustomerPrice.class);
        priceList.add(VipPrice.class);
    }


    /**
     * 获取价格
     */
    public Price getPrice (BigDecimal price) throws IllegalAccessException, InstantiationException {
        for (Class<? extends Price> clazz : priceList) {
            PriceRegion priceRegion = clazz.getAnnotation(PriceRegion.class);
            if (price.compareTo(new BigDecimal(priceRegion.max())) < 0 && price.compareTo(new BigDecimal(priceRegion.min())) > 0) {
                return clazz.newInstance();
            }
        }
        return null;
    }


    public static PriceFactory getInstance() {
        return FACTORY;
    }

}

class PriceContext {

    BigDecimal getPrice(BigDecimal costPrice) throws Exception {
        Price price = PriceFactory.getInstance().getPrice(costPrice);
        return price.getPrice(costPrice);
    }
}
