package step03.p09;

public class Coffee extends Menu {
    private String coffeeType;
    private String size;

    public Coffee(int price, String coffeeType, String size) {
        super("커피", coffeeType + " 커피", price);
        this.coffeeType = coffeeType;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getInfo() {
        return coffeeType + ": " + getPrice() + "원";
    }
}
