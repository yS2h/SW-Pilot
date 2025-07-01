package step05.p08;

public class EnvironmentInfo {
    private String date;
    private double oxygen;
    private double humidity;
    private double temperature;

    public EnvironmentInfo(String date, double oxygen, double humidity, double temperature) {
        this.date = date;
        this.oxygen = oxygen;
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public static EnvironmentInfo fromLine(String line) {
        try {
            String[] parts = line.split(",");
            String date = parts[0].split(" ")[0];
            double oxygen = Double.parseDouble(parts[1]);
            double humidity = Double.parseDouble(parts[2]);
            double temperature = Double.parseDouble(parts[3]);

            return new EnvironmentInfo(date, oxygen, humidity, temperature);
        } catch (Exception e) {
            return null;
        }
    }

    public String getDate() {
        return date;
    }

    public void setOxygen(double oxygen) {
        this.oxygen = oxygen;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String toLine() {
        return date + " 00:00," + oxygen + "," + humidity + "," + temperature;
    }

    @Override
    public String toString() {
        return oxygen + "," + humidity + "," + temperature;
    }
}
