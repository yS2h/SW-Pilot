package step05.p06;

import java.util.Scanner;

public class BiodomeForever06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResearcherManager manager = new ResearcherManager();

        int input = 0;
        System.out.println("연구원 정보 관리 시스템");

        while (input != 4) {
            System.out.println("\n1. 새로운 연구자 등록");
            System.out.println("2. 모든 연구자 조회");
            System.out.println("3. 조건 기반 연구자 검색");
            System.out.println("4. 프로그램 종료");
            System.out.println("====================================");
            System.out.print("선택하세요 (1-4): ");

            String s = scanner.nextLine();
            try {
                input = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                continue;
            }

            switch (input) {
                case 1:
                    manager.register();
                    break;
                case 2:
                    manager.print();
                    break;
                case 3:
                    manager.search();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다. 감사합니다.");
                    break;
                default:
                    System.out.println("1~4 중에서 선택해주세요.");
            }
        }

        scanner.close();
    }
}
