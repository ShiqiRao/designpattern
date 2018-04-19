package decorator;

public class Whip implements Beverage {

    private Beverage beverage;
    private String description = "Whip";

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + description;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.7;
    }
}
