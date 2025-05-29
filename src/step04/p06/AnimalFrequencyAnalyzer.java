package step04.p06;

import java.util.HashMap;
import java.util.Map;

public class AnimalFrequencyAnalyzer {
    Map<String, Integer> animalCountMap;

    public AnimalFrequencyAnalyzer() {
        animalCountMap = new HashMap<>();
    }

    public void update(String key) {
        animalCountMap.put(key, animalCountMap.getOrDefault(key, 0) + 1);
    }

    public void print() {
        System.out.print("관찰된 모든 동물 : ");
        for (Map.Entry<String, Integer> entry : animalCountMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }

    public String mostFrequentAnimal() {
        int max = 0;
        String result = null;

        for (Map.Entry<String, Integer> entry : animalCountMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
