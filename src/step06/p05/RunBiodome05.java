package step06.p05;

public class RunBiodome05 {
    public static void main(String[] args) {
        System.out.println("센서 모니터링을 시작합니다...\n");

        Sensor s1 = new Sensor("온도", -5.0, 32.5);
        Sensor s2 = new Sensor("산소 농도", 18.5, 23.5);

        s1.start();
        s2.start();
    }
}
