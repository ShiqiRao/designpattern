package strategy;

import java.math.BigDecimal;

public class CashNormal implements CashSuper {
    @Override
    public BigDecimal acceptCash(String money) {
        return new BigDecimal(money);
    }
}
