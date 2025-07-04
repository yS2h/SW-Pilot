package step06.p04;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class FruitStore {
    private final Path dataPath = Paths.get("src/step06/p04/fruit_data_total.csv");
    private final Map<String, Integer> stock = new HashMap<>();
    private final Map<String, List<Integer>> salesHistory = new HashMap<>();

    public FruitStore() {
        loadData();
    }

    private void loadData() {
        try {
            Files.lines(dataPath)
                    .skip(1)
                    .forEach(line -> {
                        String[] parts = line.split(",");
                        if (parts.length < 3) return;

                        String fruit = parts[0];
                        int quantity = Integer.parseInt(parts[1]);

                        List<Integer> sales = Arrays.stream(parts)
                                .skip(2)
                                .map(s -> s.split(":")[1])
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

                        stock.put(fruit, quantity);
                        salesHistory.put(fruit, sales);
                    });
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }

    public void showAllStock() {
        System.out.println("\n모든 과일 재고 조회:");
        stock.forEach((fruit, qty) ->
                System.out.println(fruit + " - " + qty + "개")
        );
        System.out.println();
    }

    public void showTopSeller() {
        Optional<Map.Entry<String, Integer>> top = salesHistory.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().stream().mapToInt(Integer::intValue).sum()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (top.isPresent()) {
            System.out.println("가장 많이 팔린 과일: " + top.get().getKey() + " - 총 " + top.get().getValue() + "개 판매됨\n");
        } else {
            System.out.println("\n판매 이력이 없습니다.\n");
        }
    }

    public void showTotalSold() {
        int total = salesHistory.values().stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("\n총 판매된 과일 수: " + total + "개\n");
    }

    public void showAveragePerFruit() {
        System.out.println("\n과일별 평균 판매 개수:");
        salesHistory.forEach((fruit, list) -> {
            double avg = list.stream().mapToInt(i -> i).average().orElse(0);
            System.out.printf("%s - %.1f개\n", fruit, avg);
        });
        System.out.println();
    }
}
