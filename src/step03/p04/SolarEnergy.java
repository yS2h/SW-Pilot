package step03.p04;

public class SolarEnergy extends EnergySource {
    public SolarEnergy() {
        super("태양광");
    }

    @Override
    public void produceEnergy(int time) {
        addEnergy(time * 10);
    }
}
