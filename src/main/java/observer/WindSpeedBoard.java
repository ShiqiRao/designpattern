package observer;

public class WindSpeedBoard implements Observer, DisplayElement {
    private String windSpeed;

    @Override
    public void display() {
        System.out.println("Current wind speed is " + windSpeed);
    }

    @Override
    public void update(DataBean dataBean) {
        windSpeed = dataBean.getWindSpeed();
        display();
    }
}
