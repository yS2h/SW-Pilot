package step03;

public class SolarEnergy extends EnergySource {
    public SolarEnergy() {
        super("태양광");
    }

    @Override
    public void produceEnergy(int time) {
        addEnergy(time * 10);
    }
}
