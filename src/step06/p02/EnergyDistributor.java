package step06.p02;

import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface EnergyAssigner {
    void assign(String zone, int amount);
}

public class EnergyDistributor {
    private final Map<String, Integer> manager = new HashMap<>();
    private int totalEnergy = 50000;

    public EnergyDistributor() {
        manager.put("플로우브릿지", 0);
        manager.put("루미나베이", 0);
        manager.put("테라노바", 0);
    }

    public void printTotalEnergy() {
        System.out.println("\n→ 전체 남은 에너지: " + totalEnergy);
    }

    public void allocateEnergy(String zone, int amount) {
        if (amount > totalEnergy) {
            System.out.println("\n→ 할당 가능한 에너지를 초과했습니다.");
            return;
        }

        EnergyAssigner assigner = (z, a) -> {
            manager.put(z, manager.getOrDefault(z, 0) + a);
            totalEnergy -= a;
            System.out.println("\n→ " + z + "에 " + a + "의 에너지가 할당되었습니다. 남은 전체 에너지: " + totalEnergy);
        };

        assigner.assign(zone, amount);
    }

    public void printZoneEnergy() {
        System.out.println("→ 구역별 에너지 조회");
        manager.forEach((zone, energy) -> System.out.println(zone + " - " + energy));
    }
}
