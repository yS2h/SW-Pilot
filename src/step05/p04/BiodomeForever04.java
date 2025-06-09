package step05.p04;

import java.util.Scanner;

public class BiodomeForever04 {
    public static void main(String[] args) {
        EnvironmentManager manager = new EnvironmentManager("D:\\SWPilot\\src\\step05\\p04\\");
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("환경 정보 관리 시스템에 오신 것을 환영합니다.");

        while (input != 3) {
            System.out.println("\n1. 새로운 환경 데이터 입력");
            System.out.println("2. 모든 환경 데이터 조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("선택: ");

            String selection = scanner.nextLine();
            try {
                input = Integer.parseInt(selection);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                continue;
            }

            switch (input) {
                case 1:
                    boolean success = manager.saveData(scanner);
                    if (!success) {
                        System.out.println("잘못된 값입니다. 온도, 습도, 산소 농도는 숫자로 입력해주세요.");
                    }
                    break;
                case 2:
                    manager.print();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다. 감사합니다.");
                    break;
                default:
                    System.out.println("1~3 중에서 선택해주세요.");
            }
        }

        scanner.close();
    }
}
