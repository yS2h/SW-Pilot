package step06.p08;

import java.text.SimpleDateFormat;
import java.util.*;

public class ElephantSensor implements SensorSubject {
    private final List<SensorObserver> observers = new ArrayList<SensorObserver>();
    private final Random random = new Random();
    private double temperature;
    private int heartRate;

    public double getTemperature() {
        return temperature;
    }

    public int getHeartRate() {
        return heartRate;
    }


    @Override
    public void registerObserver(SensorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(SensorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (SensorObserver observer : observers) {
            observer.update(this);
        }
    }

    public String getTimestamp() {
        return new SimpleDateFormat("yyyy년 M월 d일 HH시 mm분 ss초").format(new Date());
    }

    public void generateData() {
        temperature = Math.round((33 + random.nextDouble() * 7) * 10) / 10.0;
        heartRate = 20 + random.nextInt(31);
        System.out.println(getTimestamp() + " 체온 : " + temperature + "°C, 심박수 : " + heartRate + "bpm");

        notifyObservers();
    }

    public void start() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                generateData();
            }
        }, 0, 10_000);
    }
}
