package step03.p03;


public class Fish extends Animal {
    private int finsCount;

    public Fish(String name, String habitat, String diet, String food, int finsCount) {
        super(name, habitat, diet, food);
        this.finsCount = finsCount;
    }

    public void swim() {
        System.out.println(getName() + "이(가) " + finsCount + "개의 지느러미로 수영합니다.");
    }
}
