package step04.p04;

public class BiologicalEntity<T> {
    private String name;
    private String group;
    private T feature;

    public BiologicalEntity(String name, String group, T feature) {
        this.name = name;
        this.group = group;
        this.feature = feature;
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + group + ", " + feature.toString();
    }
}
