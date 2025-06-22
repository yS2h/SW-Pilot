package step05.p06;

import java.time.LocalDate;
import java.util.Random;

public class Researcher {
    private static final Random random = new Random();
    private static int order = 0;

    private String id;
    private String name;
    private String date;
    private String location;

    public Researcher(String name, String location) {
        this.id = generateId();
        this.name = name;
        this.date = LocalDate.now().toString();
        this.location = location;
    }

    private String generateId() {
        String year = String.valueOf(LocalDate.now().getYear());
        String orderNum = String.format("%02d", order++);
        String randNum = String.format("%03d", random.nextInt(1000));
        return "LUMI-" + year + "-" + orderNum + ":" + randNum;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", id, name, date, location);
    }
}
