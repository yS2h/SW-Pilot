package step03.p03;

public class Animal extends Organism {
    private String diet;
    private String food;

    public Animal(String name, String habitat, String diet, String food) {
        super(name, "동물", habitat);
        this.diet = diet;
        this.food = food;
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat() + ", " + diet + ", " + food);
    }
}
