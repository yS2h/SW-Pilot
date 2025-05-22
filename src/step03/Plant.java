package step03;

public class Plant extends Organism {
    private String season;
    private String fruit;

    public Plant(String name, String habitat, String season, String fruit) {
        super(name, "식물", habitat);
        this.season = season;
        this.fruit = fruit;
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat() + ", " + season + ", " + fruit);
    }
}
