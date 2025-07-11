package step06.p06;

public class RunBiodome06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new WaterTank(i));
            t.start();
        }
    }

}
