package step03.p09;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private List<Menu> menuList = new ArrayList<>();
    private List<OrderList> orderLists = new ArrayList<>();

    public void addMenu(Menu menu) {
        menuList.add(menu);
        System.out.println(menu.getMenuType() + "가 추가되었습니다. " + menu.getInfo());
    }

    public void removeMenu(Menu menu) {
        menuList.remove(menu);
        System.out.println(menu.getMenuType() + "가 삭제되었습니다.");
    }

    public Menu findMenu(String name) {
        for (Menu menu : menuList) {
            if (menu.getName().equals(name)) {
                return menu;
            }
        }
        return null;
    }

    public void addOrder(OrderList orderList) {
        if (orderList.isEmpty()) {
            return;
        }
        orderLists.add(orderList);
        System.out.println("\n=== 주문이 추가되었습니다. ===");
        orderList.printOrderList();
        System.out.println();
    }

    public void printOrderLists() {
        System.out.print("모든 주문을 출력합니다.");
        int idx = 1;
        for (OrderList orderList : orderLists) {
            System.out.println("\n주문" + idx++ + ".");
            orderList.printOrderList();
        }
    }

}
