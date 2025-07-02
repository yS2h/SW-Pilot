package step06.p01;

import java.util.*;
import java.util.stream.*;

public class RunBiodome01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("멤버 리스트를 입력하세요:");
        String input = scanner.nextLine();

        List<String> members = Arrays.stream(input.replaceAll("[\\[\\]]", "").split(", "))
                .filter(s -> s.startsWith("신입-"))
                .map(s -> s.substring(3) + "님 환영합니다")
                .collect(Collectors.toList());

        System.out.println(members);
    }
}
