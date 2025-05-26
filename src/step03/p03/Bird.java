package step03.p03;

public class Bird extends Animal {
    private int wingSpan;

    public Bird(String name, String habitat, String diet, String food, int wingSpan) {
        super(name, habitat, diet, food);
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println(getName() + "이(가) 날개폭 " + wingSpan + "으로 납니다");
    }
}
