package step04.p04;

import java.util.*;

public class BiologicalSystem {
    List<BiologicalEntity<?>> entityList;

    public BiologicalSystem() {
        entityList = new ArrayList<>();
        System.out.println("생물정보 시스템이 생성되었습니다.");
    }

    public void add(BiologicalEntity<?> e) {
        entityList.add(e);
        System.out.println("새로운 동물이 등록되었습니다 : " + e.getName());
    }

    public void delete(BiologicalEntity<?> e) {
        entityList.remove(e);
        System.out.println("생물이 삭제 되었습니다 : " + e.getName());
    }

    public void show() {
        int idx = entityList.size() - 1;
        if (entityList.isEmpty())
            System.out.println("리스트가 비어져 있습니다.");
        else
            System.out.println("최신 등록 생물 : " + entityList.get(idx).toString());
    }

    public void clear() {
        entityList.clear();
        System.out.println("모든 정보를 삭제했습니다.");
    }

    public void isEmpty() {
        if (entityList.isEmpty())
            System.out.println("생물 정보 리스트가 비어있습니다.");
        else
            System.out.println("생물 정보 리스트가 비어있지 않습니다.");
    }
}
