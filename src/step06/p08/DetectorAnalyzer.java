package step06.p08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DetectorAnalyzer implements SensorObserver {
    private final List<String> dataList = new ArrayList<>();

    @Override
    public void update(ElephantSensor sensor) {
        double temp = sensor.getTemperature();
        int hr = sensor.getHeartRate();
        String timestamp = sensor.getTimestamp();

        Stream.of(temp).filter(t -> t < 35.9 || t > 37.5).forEach(t -> {
            System.out.println("[분석기 1] 임계치 이상 체온 : " + t + "°C");
            dataList.add(timestamp + " 체온 : " + t + "°C");
        });

        Stream.of(hr).filter(h -> h < 25 || h > 40).forEach(h -> {
            System.out.println("[분석기 1] 임계치 이상 심박수 : " + h + "bpm");
            dataList.add(timestamp + " 심박수 : " + h + "bpm");
        });
    }
}
