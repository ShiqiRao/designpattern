package decorator;

public class Milk implements Beverage {

    private Beverage beverage;
    private String description  = "Milk";

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + description;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.8;
    }
}
