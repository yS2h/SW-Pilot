package step02;

import java.util.*;

public class RoadToBiodome06 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        boolean TF = true;
        try {
            for (String s : args) {
                String str = s.replace("[", "").replace(",", "").replace("]", "");
                int n = Integer.parseInt(str);

                if (n < 0 || n > 100) {
                    System.out.println("잘못된 입력입니다. 1~100 사이의 숫자를 입력하세요");
                    return;
                }

                if (TF) {
                    l1.add(n);
                } else {
                    l2.add(n);
                }

                if (s.contains("]")) {
                    TF = false;
                }
            }
            System.out.printf("Mean : %.1f, Median : %.1f\n", mean(l1, l2), median(l1, l2));

        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 1~100 사이의 숫자를 입력하세요");
        }
    }

    public static double mean(List<Integer> l1, List<Integer> l2) {
        int sum = 0;
        for (int i : l1)
            sum += i;
        for (int i : l2)
            sum += i;
        return (double) sum / (l1.size() + l2.size());
    }

    public static double median(List<Integer> l1, List<Integer> l2) {
        if (l1.size() > l2.size()) {
            return median(l2, l1);
        }

        int n = l1.size(), m = l2.size();
        int left = 0, right = n;

        while (left <= right) {
            int x = (left + right) / 2;
            int y = (n + m + 1) / 2 - x;

            int maxLeftX = (x == 0) ? Integer.MIN_VALUE : l1.get(x - 1);
            int minRightX = (x == n) ? Integer.MAX_VALUE : l1.get(x);
            int maxLeftY = (y == 0) ? Integer.MIN_VALUE : l2.get(y - 1);
            int minRightY = (y == m) ? Integer.MAX_VALUE : l2.get(y);

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((n + m) % 2 != 0) {
                    return Math.max(maxLeftX, maxLeftY);
                } else {
                    return (double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                }
            } else if (maxLeftX > minRightY) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return Double.NaN;
    }
}
