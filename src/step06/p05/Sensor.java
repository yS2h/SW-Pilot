package step06.p05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Sensor extends Thread {
    private final String type;
    private final double minValue;
    private final double maxValue;
    private double currentValue;

    public Sensor(String type, double minValue, double maxValue) {
        this.type = type;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    private double generateData() {
        Random rand = new Random();
        currentValue = minValue + (maxValue - minValue) * rand.nextDouble() * 1.5;
        return currentValue;
    }

    private void printData() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 HH시 mm분 ss초");
        String time = sdf.format(new Date());
        String unit = type.equals("온도") ? "°C" : "%";

        String message = time + " " + type + ": " + String.format("%.1f", currentValue) + unit;
        if (currentValue < minValue) {
            message += " [경고: " + type + " 하한 미달]";
        } else if (currentValue > maxValue) {
            message += " [경고: " + type + " 상한 초과]";
        }

        System.out.println(message);
    }

    @Override
    public void run() {
        while (true) {
            generateData();
            printData();

            int millis = currentValue < minValue || currentValue > maxValue ? 1000 : 5000;

            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                System.out.println(type + " 센서 종료됨.");
                break;
            }
        }
    }
}
