package step01;

public class HelloBiodome09 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            if (n < 3 || n > 100) {
                System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요");
                return;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                int mid = 2 * (i - 1) / 2;
                for (int j = 0; j < (2 * i - 1); j++) {
                    if (j == mid)
                        System.out.print("&");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
            System.out.println(" ".repeat(n - 1) + "|");
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요");
        }
    }
}
