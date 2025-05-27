package step03.p09;

import java.time.LocalDateTime;

public class Order {
    private Menu menu;
    private int quantity;
    private String orderer;
    private LocalDateTime orderTime;

    public Order(Menu menu, int quantity, String orderer, LocalDateTime orderTime) {
        this.menu = menu;
        this.quantity = quantity;
        this.orderer = orderer;
        this.orderTime = orderTime;
    }

    public Order(Menu menu, String orderer, LocalDateTime orderTime) {
        this.menu = menu;
        this.quantity = 1;
        this.orderer = orderer;
        this.orderTime = orderTime;
    }

    public String getOrderInfo() {
        if (menu instanceof Beverage b) {
            return b.getName() + " 음료 (사이즈: " + b.getSize() + ") - " + quantity + "잔: " + totalPrice() + "원";
        } else if (menu instanceof Coffee c) {
            return c.getName() + " (사이즈: " + c.getSize() + ") - " + quantity + "잔: " + totalPrice() + "원";
        } else {
            return menu.getName() + " - " + quantity + "개: " + totalPrice() + "원";
        }
    }

    public Menu getMenu() {
        return menu;
    }
    
    public String getOrderer() {
        return orderer;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public int totalPrice() {
        return menu.getPrice() * quantity;
    }
}
