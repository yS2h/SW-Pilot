package step03.p09;

import java.time.LocalDateTime;

public class Sandwich extends Menu {
    private String ingredient;
    private LocalDateTime exp;

    public Sandwich(String name, int price, String ingredient, LocalDateTime exp) {
        super("샌드위치", name, price);
        this.ingredient = ingredient;
        this.exp = exp;
    }

    public LocalDateTime getExp() {
        return exp;
    }

    @Override
    public String getInfo() {
        return getName() + ": " + getPrice() + "원 (재료: " + ingredient + ", 만료일: " + exp.toLocalDate() + ")";
    }
}
