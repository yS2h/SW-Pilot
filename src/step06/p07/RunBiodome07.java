package step06.p07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RunBiodome07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        City c1 = new City("TerraNova");
        City c2 = new City("LuminaBay");
        City c3 = new City("FlowBridges");

        Map<String, City> cityMap = new HashMap<>();
        cityMap.put("TerraNova", c1);
        cityMap.put("LuminaBay", c2);
        cityMap.put("FlowBridges", c3);

        System.out.println("에너지 관리 시스템에 오신걸 환영합니다.");

        while (true) {
            System.out.println("\n1. 중앙 에너지 센터와 3개 도시 에너지양 조회하기");
            System.out.println("2. 도시에 에너지 할당하기");
            System.out.println("3. 프로그램 종료하기");
            System.out.print("메뉴 선택: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("\n중앙 에너지 센터와 3개 도시 에너지양 조회");
                    System.out.println("중앙 에너지 센터: " + EnergyManageCenter.getInstance().getTotalEnergy());
                    c1.printEnergy();
                    c2.printEnergy();
                    c3.printEnergy();
                    break;

                case "2":
                    System.out.print("\n도시 이름 입력: ");
                    String cityName = scanner.nextLine();
                    if (cityMap.get(cityName) == null) {
                        System.out.println("존재하지 않는 도시입니다.");
                        break;
                    }

                    System.out.print("할당할 에너지양 입력: ");
                    try {
                        int amount = Integer.parseInt(scanner.nextLine());
                        cityMap.get(cityName).requestEnergy(amount);
                    } catch (NumberFormatException e) {
                        System.out.println("숫자를 입력해주세요.");
                    }
                    break;

                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 1~3 중에서 선택해주세요.");
            }
        }
    }
}
