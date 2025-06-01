package step04.p07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlantPriorityQueue {
    private List<Plant> plants = new ArrayList<>();

    public Plant peek() {
        if (plants.isEmpty()) {
            return null;
        }
        return plants.get(0);
    }

    public void offer(Plant p) {
        plants.add(p);
        Collections.sort(plants);
    }

    public void add(Plant p) {
        offer(p);
    }

    public void clear() {
        plants.clear();
    }

    public void remove(Plant p) {
        plants.remove(p);
    }

    public boolean isEmpty() {
        return plants.isEmpty();
    }

    public void printAll() {
        for (Plant p : plants) {
            System.out.println(p.toString());
        }
    }
}
