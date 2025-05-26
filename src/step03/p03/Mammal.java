package step03.p03;

public class Mammal extends Animal {
    private boolean warmBlooded;

    public Mammal(String name, String habitat, String diet, String food, boolean warmBlooded) {
        super(name, habitat, diet, food);
        this.warmBlooded = warmBlooded;
    }

    public void giveBirth() {
        System.out.println(getName() + "이(가) 새끼를 낳습니다.");
    }
}


