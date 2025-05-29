package step04.p04;

public class MicrobeFeature {
    private String environment;
    private String metabolism;

    public MicrobeFeature(String environment, String metabolism) {
        this.environment = environment;
        this.metabolism = metabolism;
    }

    @Override
    public String toString() {
        return environment + ", " + metabolism;
    }
}
