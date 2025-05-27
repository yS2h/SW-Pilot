package step03.p09;

public abstract class Menu {
    private String name;
    private int price;
    private String menuType;

    public Menu(String menuType, String name, int price) {
        this.menuType = menuType;
        this.name = name;
        this.price = price;
    }

    public String getMenuType() {
        return menuType;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getInfo();
}
