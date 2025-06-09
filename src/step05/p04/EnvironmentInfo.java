package step05.p04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnvironmentInfo {
    private String time;
    private double temperature;
    private double humidity;
    private double oxygen;
    private String place;

    public EnvironmentInfo(double temperature, double humidity, double oxygen, String place) {
        time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.temperature = temperature;
        this.humidity = humidity;
        this.oxygen = oxygen;
        this.place = place;
    }

    public String writeFormat() {
        return time + "," + temperature + "," + humidity + "," + oxygen + "," + place;
    }
}
