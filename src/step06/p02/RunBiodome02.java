package step06.p02;

import java.util.Scanner;

public class RunBiodome02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnergyDistributor ed = new EnergyDistributor();

        System.out.println("바이오도메 에너지 관리 시스템에 오신 것을 환영합니다.");

        while (true) {
            System.out.println("\n1. 전체 에너지 조회하기");
            System.out.println("2. 특정 구역 에너지 할당하기");
            System.out.println("3. 구역별 에너지 조회하기");
            System.out.println("4. 종료하기");
            System.out.print("\n메뉴를 선택하세요: ");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    ed.printTotalEnergy();
                    break;
                case "2":
                    System.out.print("할당하려는 구역 이름을 입력하세요: ");
                    String zone = sc.nextLine();
                    System.out.print("할당하려는 에너지량을 입력하세요: ");
                    try {
                        int amount = Integer.parseInt(sc.nextLine());
                        ed.allocateEnergy(zone, amount);
                    } catch (NumberFormatException e) {
                        System.out.println("유효한 숫자를 입력해주세요.");
                    }
                    break;
                case "3":
                    ed.printZoneEnergy();
                    break;
                case "4":
                    System.out.println("→ 바이오도메 에너지 관리 시스템을 종료합니다. 감사합니다.");
                    return;
                default:
                    System.out.println("→ 1번에서 4번 메뉴를 선택해주세요.");
            }
        }
    }
}
