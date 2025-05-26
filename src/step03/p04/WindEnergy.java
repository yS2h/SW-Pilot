package step03.p04;

public class WindEnergy extends EnergySource {
    public WindEnergy() {
        super("풍력");
    }

    @Override
    public void produceEnergy(int speed) {
        addEnergy(speed * 5);
    }
}
