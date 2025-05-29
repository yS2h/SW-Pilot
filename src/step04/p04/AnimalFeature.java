package step04.p04;

public class AnimalFeature {
    private String behavior;
    private String group;
    private int lifeSpan;

    public AnimalFeature(String behavior, String group, int lifeSpan) {
        this.behavior = behavior;
        this.group = group;
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return behavior + ", " + group + ", " + lifeSpan + "년";
    }
}
