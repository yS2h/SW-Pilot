package step01;

public class HelloBiodome04 {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
            return;
        }

        try {
            double temp, hum, oxy;
            temp = Double.parseDouble(args[0]);
            hum = Double.parseDouble(args[1]);
            oxy = Double.parseDouble(args[2]);

            String s = T(temp) ? "온도" : H(hum) ? "습도" : O(oxy) ? "산소 농도" : "";

            if (s.isEmpty()) {
                System.out.printf("생명의 나무는 안정적인 상태입니다 :)" + "건강지수는 H = %.2f 입니다.", Hcalc(hum, temp, oxy));
            } else {
                System.out.println(s + "값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
        }
    }

    public static boolean T(double t) {
        if (t < 10 || t >= 27.5)
            return true;
        return false;
    }

    public static boolean H(double h) {
        if (h <= 40 || h > 60)
            return true;
        return false;
    }

    public static boolean O(double o) {
        if (o < 19.5 || o > 23.5)
            return true;
        return false;
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

    public static double Hcalc(double x, double y, double z) {
        return 0.415 * abs(sqrt(x), y) + (z / (PI * PI));
    }
}
