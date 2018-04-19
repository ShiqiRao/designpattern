package decorator;

public class Mocha implements Beverage {

    private String description = "Mocha";


    @Override
    public String getDescription() {
        return  description;
    }

    @Override
    public Double cost() {
        return 1.9;
    }
}
