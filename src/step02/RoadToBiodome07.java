package step02;

import java.util.*;

import static java.lang.System.exit;

public class RoadToBiodome07 {

    public static void main(String[] args) {
        Map<String, Integer> m = freq(args);
        if (m == null) {
            return;
        }
        String[] animals = m.keySet().toArray(new String[0]);

        // 선택 정렬
        for (int i = 0; i < animals.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < animals.length; j++) {
                String a = animals[j];
                String b = animals[maxIdx];

                if (m.get(a) > m.get(b) || (m.get(a) == m.get(b) && a.compareTo(b) < 0)) {
                    maxIdx = j;
                }
            }

            String temp = animals[i];
            animals[i] = animals[maxIdx];
            animals[maxIdx] = temp;
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]);
            if (i != animals.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static Map<String, Integer> freq(String[] animals) {
        Map<String, Integer> m = new HashMap<>();

        for (String s : animals) {
            if (isNumber(s)) {
                System.out.println("숫자값이 아닌 동물 이름을 입력해 주세요.");
                return null;
            }
            m.put(s, m.getOrDefault(s, 0) + 1);
        }

        return m;
    }

    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
