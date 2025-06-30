package step05.p07;

public class EnvironmentInfo {
    private String date;
    private String time;
    private double oxygen;
    private double humidity;
    private double temperature;

    public EnvironmentInfo(String date, String time, double oxygen, double humidity, double temperature) {
        this.date = date;
        this.time = time;
        this.oxygen = oxygen;
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public static EnvironmentInfo fromLine(String line) {
        try {
            String[] parts = line.split(",");
            String[] dateTime = parts[0].split(" ");
            String date = dateTime[0];
            String time = dateTime[1];
            double oxygen = Double.parseDouble(parts[1]);
            double humidity = Double.parseDouble(parts[2]);
            double temperature = Double.parseDouble(parts[3]);

            return new EnvironmentInfo(date, time, oxygen, humidity, temperature);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return date + " " + time + "," + oxygen + "," + humidity + "," + temperature;
    }
}
