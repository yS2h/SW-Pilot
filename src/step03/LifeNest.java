package step03;

import java.util.ArrayList;
import java.util.List;

public class LifeNest {
    List<Organism> organismList = new ArrayList<>();

    public void addOrganism(Organism organism) {
        organismList.add(organism);
        System.out.println("[LifeNest] " + organism.name + "이(가) 추가되었습니다.");
    }

    public void removeOrganism(Organism organism) {
        if (organismList.removeIf(o -> o.name.equals(organism.name))) {
            System.out.println("[LifeNest] " + organism.name + "이(가) 추가되었습니다.");
        }
    }

    public void displayAll() {
        System.out.println("전체 동식물 목록 출력:");
        for (int i = 0; i < organismList.size(); i++) {
            System.out.print(i + 1 + ". ");
            organismList.get(i).displayInfo();
        }
    }

}
