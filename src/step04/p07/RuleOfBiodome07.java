package step04.p07;

import java.time.LocalDateTime;

public class RuleOfBiodome07 {
    public static void main(String[] args) {
        System.out.println("(식물 개체 생성)");
        Plant p1 = new Plant("백합", "화초", 100, LocalDateTime.of(2130, 3, 12, 12, 0), 15);
        Plant p2 = new Plant("나무딸기", "과일나무", 200, LocalDateTime.of(2130, 3, 12, 14, 20), 20);
        Plant p3 = new Plant("선인장", "다육식물", 5, LocalDateTime.of(2130, 3, 12, 9, 0), 30);
        Plant p4 = new Plant("라일락", "관목", 20, LocalDateTime.of(2130, 3, 12, 11, 0), 25);
        Plant p5 = new Plant("대나무", "목본", 15, LocalDateTime.of(2130, 3, 11, 19, 0), 50);

        System.out.println("\n(식물 관리 시스템 생성 및 등록)");
        PlantSystem ps = new PlantSystem();
        ps.addPlant(p1);
        ps.addPlant(p2);
        ps.addPlant(p3);
        ps.addPlant(p4);
        ps.addPlant(p5);

        System.out.println("\n(우선 순위에 따른 식물 출력 및 관리)");
        ps.supplyWater();
        ps.supplyWater();
        ps.supplyWater();

        System.out.println("\n(남아있는 식물)");
        ps.printPlants();
    }
}
