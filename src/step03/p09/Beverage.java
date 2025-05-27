package step03.p09;

public class Beverage extends Menu {
    private String size;

    public Beverage(String name, int price, String size) {
        super("음료", name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getInfo() {
        return getName() + ": " + getPrice() + "원";
    }
}
