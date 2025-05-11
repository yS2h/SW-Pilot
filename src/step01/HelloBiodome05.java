package step01;

public class HelloBiodome05 {
    public static void main(String[] args) {
        int[] answer = find();
        int g = answer[0];
        int h = answer[1];

        three(g, h);
        four(g, h);
    }

    public static int[] find() {
        for (int g = 0; g < 16; g++) {
            for (int h = 0; h < 16; h++) {
                if (one(g, h) && two(g, h)) {
                    return new int[]{g, h};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static boolean one(int g, int h) {
        return (g & 1 >> g << 2 | h + g ^ h) == 1;
    }

    public static boolean two(int g, int h) {
        return (g % 2 << h >> g | 1 & 0 ^ 0) == 2;
    }

    public static void three(int g, int h) {
        int answer = (h * h + g) * (h << h) + (g << g);
        System.out.println(answer);
    }

    public static void four(int g, int h) {
        int answer = (h | g) - (h >> g) * (h << h) + (g << g);
        System.out.println(answer);
    }
}
