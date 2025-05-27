package step03.p09;

import java.time.LocalDateTime;

public class BiodomeFamily09 {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        cafe.addMenu(new Coffee(4000, "블렌드", "톨"));
        cafe.addMenu(new Coffee(4500, "다크", "숏"));
        cafe.addMenu(new Coffee(4200, "디카페인", "벤티"));

        cafe.addMenu(new Beverage("캐모마일", 3000, "톨"));
        cafe.addMenu(new Beverage("오렌지 쥬스", 3500, "벤티"));
        cafe.addMenu(new Beverage("물", 1000, "숏"));

        cafe.addMenu(new Sandwich("야채 샌드위치", 5000, "야채", LocalDateTime.of(2025, 5, 31, 0, 0)));
        cafe.addMenu(new Sandwich("햄 샌드위치", 6000, "햄", LocalDateTime.of(2025, 6, 1, 0, 0)));
        cafe.addMenu(new Sandwich("치즈 샌드위치", 5500, "치즈", LocalDateTime.of(2024, 11, 25, 0, 0)));

        OrderList jamy = new OrderList();
        jamy.addOrder(new Order(cafe.findMenu("블렌드 커피"), 2, "제이미", LocalDateTime.now().minusMinutes(2)));
        jamy.addOrder(new Order(cafe.findMenu("야채 샌드위치"), "제이미", LocalDateTime.now().minusMinutes(2)));
        cafe.addOrder(jamy);

        OrderList renya = new OrderList();
        renya.addOrder(new Order(cafe.findMenu("캐모마일"), "레냐", LocalDateTime.now()));
        cafe.addOrder(renya);

        OrderList suding = new OrderList();
        suding.addOrder(new Order(cafe.findMenu("치즈 샌드위치"), "수딩", LocalDateTime.now()));
        cafe.addOrder(suding);

        cafe.printOrderLists();
    }
}
