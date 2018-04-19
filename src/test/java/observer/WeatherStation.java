package observer;

import org.junit.Test;

public class WeatherStation {
    @Test
    public void publishWeatherData() {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new TemperatureBoard());
        weatherData.registerObserver(new HumidityBoard());
        weatherData.registerObserver(new WindSpeedBoard());
        weatherData.setDataBean(new DataBean("25℃", "20%", "2F"));
    }
}
