package step03;

public abstract class EnergySource {
    private final String sourceName;
    private int energyAmount;

    public EnergySource(String name) {
        this.sourceName = name;
        this.energyAmount = 0;
    }

    public String getSourceName() {
        return sourceName;
    }

    public int getEnergyAmount() {
        return energyAmount;
    }

    public void useEnergy(int amount) {
        energyAmount -= amount;
        System.out.println(sourceName + " 에너지를 " + amount + " 사용했습니다.");
    }

    public void addEnergy(int amount) {
        energyAmount += amount;
        System.out.println(sourceName + " 에너지를 " + amount + " 생산했습니다.");
    }

    public abstract void produceEnergy(int n);
}
