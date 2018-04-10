package strategy;

import java.math.BigDecimal;

public class CashRebate implements CashSuper {
    private BigDecimal condition;
    private BigDecimal rebate;

    public CashRebate(String condition,String rebate){
        this.condition = new BigDecimal(condition);
        this.rebate = new BigDecimal(rebate);
    }

    @Override
    public BigDecimal acceptCash(String money) {
        BigDecimal moneyBigDecimal = new BigDecimal(money);
        if(moneyBigDecimal.compareTo(condition) > 0){
            return moneyBigDecimal.subtract(moneyBigDecimal.divide(condition,BigDecimal.ROUND_HALF_UP).multiply(rebate));
        }
        return moneyBigDecimal;
    }
}
