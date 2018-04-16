package observer;

public class TemperatureBoard implements Observer, DisplayElement {
    private String currentTemperature;

    @Override
    public void display() {
        System.out.println("Current temperature is " + currentTemperature);
    }

    @Override
    public void update(DataBean dataBean) {
        currentTemperature = dataBean.getTemperature();
        display();
    }
}
