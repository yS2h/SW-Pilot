package step05.p07;

import java.util.Scanner;

public class BiodomeForever07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "src/step05/p07/environment_data_Lumino.txt";
        EnvironmentManager manager = new EnvironmentManager(filePath);

        System.out.println("환경 데이터 검색 프로그램을 시작합니다.");
        System.out.print("검색하고 싶은 날짜를 입력하세요: ");
        String input = scanner.nextLine();

        EnvironmentInfo result = manager.search(input);

        if (result != null) {
            System.out.println("\n→ 검색 결과: " + result.toString());
        } else {
            System.out.println("\n→ 해당 날짜의 데이터는 존재하지 않습니다.");
        }

        scanner.close();
    }
}
