package step04.p07;

import java.lang.Comparable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Plant implements Comparable<Plant> {
    private String name;
    private String type;
    private int waterAmount;
    private LocalDateTime lastWaterDate;
    private int waterPeriod;

    public Plant(String name, String type, int waterAmount, LocalDateTime lastWaterDate, int waterPeriod) {
        this.name = name;
        this.type = type;
        this.waterAmount = waterAmount;
        this.lastWaterDate = lastWaterDate;
        this.waterPeriod = waterPeriod;
        System.out.println(toString());
    }

    public void updateLastWaterDate(LocalDateTime lastWaterDate) {
        this.lastWaterDate = lastWaterDate;
    }

    public LocalDateTime calculateWaterPeriod() {
        return lastWaterDate.plusHours(waterPeriod);
    }

    public String getName() {
        return name;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public String getLastWaterDate() {
        return lastWaterDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    @Override
    public String toString() {
        return name + ", " + waterAmount + ", 마지막 물 공급 일자: " + getLastWaterDate() + ", 물 공급 주기: " + waterPeriod + "시간";
    }

    @Override
    public int compareTo(Plant other) {
        return this.calculateWaterPeriod().compareTo(other.calculateWaterPeriod());
    }
}
