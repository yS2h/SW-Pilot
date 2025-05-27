package step03.p09;

import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;

public class OrderList {
    private Queue<Order> orderList = new LinkedList<>();

    public void addOrder(Order order) {
        Menu m = order.getMenu();
        if (m instanceof Sandwich s) {
            if (order.getOrderTime().isAfter(s.getExp())) {
                System.out.println("\n--");
                System.out.println(s.getName() + " 주문 시도...");
                System.out.println("오류: 주문할 수 없는 상품입니다. (만료날짜: " + s.getExp().toLocalDate() + ")");
                System.out.println("--\n\n");
                return;
            }
        }
        orderList.add(order);
    }

    public Boolean isEmpty() {
        return orderList.isEmpty();
    }

    public int getTotalPrice() {
        int sum = 0;
        for (Order order : orderList) {
            sum += order.totalPrice();
        }
        return sum;
    }

    public void printOrderList() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        if (orderList.isEmpty()) {
            return;
        }
        Order o = orderList.peek();
        System.out.println("고객: " + o.getOrderer());
        System.out.println("주문 시각: " + o.getOrderTime().format(formatter));
        int idx = 1;
        for (Order order : orderList) {
            System.out.println(idx + ". " + order.getOrderInfo());
            idx++;
        }
        System.out.println("\n총 금액: " + getTotalPrice() + "원");
    }
}
