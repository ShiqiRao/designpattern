package strategy;

import java.math.BigDecimal;

public class CashDiscount implements CashSuper{
    private BigDecimal discount;

    public CashDiscount(String discount){
        this.discount = new BigDecimal(discount);
    }


    @Override
    public BigDecimal acceptCash(String money) {
        return new BigDecimal(money).multiply(discount);
    }
}
