package observer;

public class HumidityBoard implements Observer, DisplayElement {
    private String humidity;

    @Override
    public void display() {
        System.out.println("Current humidity is " + humidity);
    }

    @Override
    public void update(DataBean dataBean) {
        humidity = dataBean.getHumidity();
        display();
    }
}
