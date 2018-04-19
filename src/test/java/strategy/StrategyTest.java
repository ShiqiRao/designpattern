package strategy;

import org.junit.Test;

public class StrategyTest {
    @Test
    public void cashTest() {
        Context context = new Context(new CashNormal());
        System.out.println(context.getResult("1000").toString());
        context.setBehavior(new CashDiscount("0.8"));
        System.out.println(context.getResult("1000").toString());
        context.setBehavior(new CashRebate("300","100"));
        System.out.println(context.getResult("1000").toString());
    }
}
