package step05.p05;

public class EnvironmentAnalysis {
    private static final double BIO = 0.415;

    public static double calculate(EnvironmentInfo info) {
        return BIO * Math.abs(Math.sqrt(info.getHumidity()) - info.getTemperature()) + (info.getOxygen() / Math.PI * Math.PI);
    }
}
