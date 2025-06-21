package step05.p05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

public class EnvironmentInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String time;
    private double temperature;
    private double humidity;
    private double oxygen;
    private String place;

    public EnvironmentInfo(double temperature, double humidity, double oxygen, String place) {
        time = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        this.temperature = temperature;
        this.humidity = humidity;
        this.oxygen = oxygen;
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getOxygen() {
        return oxygen;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return time + ", " + temperature + "°C, " + humidity + "% 습도, " + oxygen + "% 산소 농도, " + place;
    }
}
