package step01;

public class HelloBiodome03 {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
            return;
        }

        double temp, hum, oxy;

        try {
            temp = Double.parseDouble(args[0]);
            hum = Double.parseDouble(args[1]);
            oxy = Double.parseDouble(args[2]);
            System.out.println("H = " + H(hum, temp, oxy));
        } catch (NumberFormatException e) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
        }
    }

    public static double abs(double x, double y) {
        return x - y < 0 ? -x + y : x - y;
    }

    public static double sqrt(double x) {
        double num = 1.0;

        for (int i = 1; i <= 10; i++) {
            num = (num + (x / num)) / 2.0;
        }
        return num;
    }

    public static double H(double x, double y, double z) {
        return 0.415 * abs(sqrt(x), y) + (z / (PI * PI));
    }
}
