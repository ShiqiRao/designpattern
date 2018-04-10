package strategy;

import java.math.BigDecimal;

public class Context {
    private CashSuper cashSuper;

    public Context(CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }

    public void setBehavior(CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }

    public BigDecimal getResult(String money){
        return cashSuper.acceptCash(money);
    }
}
