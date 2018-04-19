package decorator;

public class Cappuccino implements Beverage{

    private String description = "Cappuccino";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double cost() {
        return 2.2;
    }
}
