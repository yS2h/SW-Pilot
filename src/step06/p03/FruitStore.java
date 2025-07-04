package step06.p03;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;

public class FruitStore {
    private final Path dataPath = Paths.get("src/step06/p03/fruit_data.csv");
    private final Map<String, Integer> stock = new HashMap<>();
    private final Map<String, String> salesHistory = new HashMap<>();

    public FruitStore() {
        loadData();
    }

    private void loadData() {
        try {
            Files.lines(dataPath)
                    .skip(1) // 헤더 스킵
                    .map(line -> line.split(","))
                    .forEach(parts -> {
                        String fruit = parts[0];
                        int quantity = Integer.parseInt(parts[1]);
                        String history = parts.length > 2 ? parts[2] : "";
                        stock.put(fruit, quantity);
                        salesHistory.put(fruit, history);
                    });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveData() {
        List<String> lines = new ArrayList<>();
        lines.add("과일명,재고량,최근 판매 정보");
        stock.forEach((fruit, quantity) -> {
            String history = salesHistory.getOrDefault(fruit, "");
            lines.add(fruit + "," + quantity + "," + history);
        });
        try {
            Files.write(dataPath, lines);
            System.out.println("모든 데이터가 저장되었습니다. 과일 상점 관리 시스템을 종료합니다!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showAllStock() {
        System.out.println("\n모든 과일 재고 조회:");
        stock.entrySet().stream()
                .map(e -> e.getKey() + "-" + e.getValue() + "개")
                .forEach(System.out::println);
        System.out.println();
    }

    public void sellFruit(Scanner sc) {
        System.out.print("판매할 과일의 이름을 입력하세요: ");
        String name = sc.nextLine();
        if (!stock.containsKey(name)) {
            System.out.println("존재하지 않는 과일입니다.");
            return;
        }

        System.out.print("판매할 수량을 입력하세요: ");
        int qty = Integer.parseInt(sc.nextLine());
        if (qty <= 0) {
            System.out.println("마이너스 값은 입력할 수 없습니다.");
            return;
        }

        int currentStock = stock.get(name);
        if (currentStock < qty) {
            System.out.println("재고가 부족합니다.");
            return;
        }

        stock.put(name, currentStock - qty);
        salesHistory.put(name, LocalDate.now() + ":" + qty);
        System.out.println("\n" + name + " " + qty + "개가 판매되었습니다!\n");
    }

    public void addStock(Scanner sc) {
        System.out.print("재고를 추가할 과일의 이름을 입력하세요: ");
        String name = sc.nextLine();
        if (!stock.containsKey(name)) {
            System.out.println("존재하지 않는 과일입니다.");
            return;
        }

        System.out.print("추가할 수량을 입력하세요: ");
        int qty = Integer.parseInt(sc.nextLine());
        if (qty <= 0) {
            System.out.println("마이너스 값은 입력할 수 없습니다.");
            return;
        }

        stock.put(name, stock.get(name) + qty);
        System.out.println("\n" + name + " 재고가 " + qty + "개 추가되었습니다!\n");
    }
}
