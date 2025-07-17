package step06.p08;

public class RunBiodome08 {
    public static void main(String[] args) {
        ElephantSensor sensor = new ElephantSensor();

        DetectorAnalyzer detector = new DetectorAnalyzer();
        CalculationAnalyzer calculator = new CalculationAnalyzer();

        sensor.registerObserver(detector);
        sensor.registerObserver(calculator);

        sensor.start();
    }
}
