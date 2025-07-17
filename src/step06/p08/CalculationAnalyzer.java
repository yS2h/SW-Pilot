package step06.p08;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class CalculationAnalyzer implements SensorObserver {
    private final List<Double> temperatureList = new ArrayList<>();

    @Override
    public void update(ElephantSensor sensor) {
        double temp = sensor.getTemperature();
        temperatureList.add(temp);

        DoubleSummaryStatistics stats = temperatureList.stream()
                .mapToDouble(Double::doubleValue)
                .summaryStatistics();

        double avg = Math.round(stats.getAverage() * 10) / 10.0;

        System.out.println("[분석기 2] 평균 체온 : " + avg + "°C");
        System.out.println("[분석기 2] 최대 체온 : " + stats.getMax() + "°C");
        System.out.println("[분석기 2] 최소 체온 : " + stats.getMin() + "°C\n");
    }
}
