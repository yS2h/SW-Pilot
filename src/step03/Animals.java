package step03;

// 앞선 과제랑 클래스 이름이 같아 임의로 Animals로 변경
public class Animals {
    private String name;
    private String species;
    private int age;

    public Animals(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }
}
