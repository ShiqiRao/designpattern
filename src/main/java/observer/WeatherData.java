package observer;

import java.util.Vector;

public class WeatherData implements Subject {
    Vector<Observer> vector = new Vector<>();
    DataBean dataBean;

    public void setDataBean(DataBean dataBean) {
        this.dataBean = dataBean;
        notifyObserverS();
    }

    @Override
    public void registerObserver(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObserverS() {
        for (Observer observer : vector) {
            observer.update(dataBean);
        }
    }
}
