package step06.p08;

public interface SensorSubject {
    void registerObserver(SensorObserver observer);

    void removeObserver(SensorObserver observer);

    void notifyObservers();
}
