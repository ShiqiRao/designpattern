package decorator;

import org.junit.Test;

public class Starbuuuucks {
    @Test
    public void order() {
        Beverage firstOrder = new Cappuccino();
        firstOrder = new Milk(firstOrder);
        firstOrder = new Whip(firstOrder);
        System.out.println("Description:" + firstOrder.getDescription());
        System.out.println("Cost:" + firstOrder.cost() + "$");

        Beverage secondOrder = new Mocha();
        secondOrder = new Whip(secondOrder);
        secondOrder = new Whip(secondOrder);
        System.out.println("Description:" + secondOrder.getDescription());
        System.out.println("Cost:" + secondOrder.cost() + "$");
    }
}
