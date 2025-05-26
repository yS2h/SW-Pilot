package step03.p02;

public class BiodomeFamily02 {
    public static void main(String[] args) {
        LifeNest nest = new LifeNest();

        Organism a = new Organism("코끼리", "동물", "습지대", "지능이 높다", 60);
        Organism b = new Organism("라일락", "식물", "온대 지역", "향기가 강하다", 100);

        nest.addOrganism(a);
        nest.addOrganism(b);

        nest.displayAll();

        a.setCharacteristic("코가 길다");

        nest.displayAll();
    }
}
