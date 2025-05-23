package step03;

public class GeothermalEnergy extends EnergySource {
    public GeothermalEnergy() {
        super("지열");
    }

    @Override
    public void produceEnergy(int degree) {
        addEnergy(degree * 5 + 20);
    }
}
