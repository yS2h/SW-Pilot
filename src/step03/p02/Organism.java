package step03.p02;

public class Organism {
    private String name;
    private String species;
    private String habitat;
    private String characteristic;
    private int lifeSpan;

    public Organism(String name, String species, String habitat, String characteristic, int lifeSpan) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
        this.characteristic = characteristic;
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
        System.out.println("[LifeNest] " + name + " 서식지가 변경되었습니다.");
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
        System.out.println("[LifeNest] " + name + "의 특징이 변경되었습니다.");
    }

    public void displayInfo() {
        System.out.println(name + ", " + species + ", " + habitat + ", " + characteristic + ", " + lifeSpan + "년");
    }
}