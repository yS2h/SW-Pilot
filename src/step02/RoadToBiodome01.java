package step02;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (String s : args) {
            int num = Integer.parseInt(s);
            if (num < 0 || num > 1000) {
                System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                return;
            }
            list.add(num);
        }

        int[] cnt = count(list);
        for (int i : list) {
            if (cnt[i] == 1)
                System.out.println(i);
        }
    }

    public static int[] count(List<Integer> list) {
        int[] cnt = new int[1001];
        for (int i : list) {
            cnt[i]++;
        }
        return cnt;
    }
}
