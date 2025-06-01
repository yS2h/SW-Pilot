package step04.p07;

import java.time.LocalDateTime;

public class PlantSystem {
    PlantPriorityQueue ppq;

    public PlantSystem() {
        ppq = new PlantPriorityQueue();
        System.out.println("식물 관리 시스템이 생성되었습니다.");
    }

    public void addPlant(Plant p) {
        ppq.add(p);
        System.out.println(p.getName() + "이 관리 대상 목록에 추가되었습니다.");
    }

    public void supplyWater() {
        if (ppq.isEmpty()) {
            System.out.println("관리 대상이 없습니다.");
            return;
        }
        Plant p = ppq.peek();
        System.out.println("우선 관리 대상: " + p.getName() + ", 필요한 물의 양: " + p.getWaterAmount());
        ppq.remove(p);
        p.updateLastWaterDate(LocalDateTime.now());
        System.out.println(p.getName() + " 물을 공급했습니다. 마지막 물 공급 일자 업데이트: [" + p.getLastWaterDate() + "]");
    }

    public void printPlants() {
        if (ppq.isEmpty()) {
            System.out.println("관리 대상이 없습니다.");
        } else {
            ppq.printAll();
        }
    }
}
