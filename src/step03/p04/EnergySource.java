package step03.p04;

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
        if (amount > energyAmount) {
            System.out.println("에너지가 부족해 " + sourceName + " " + amount + "을 사용할 수 없습니다.");
            return;
        }
        energyAmount -= amount;
        System.out.println(sourceName + " 에너지를 " + amount + " 사용했습니다.");
    }

    public void addEnergy(int amount) {
        energyAmount += amount;
        System.out.println(sourceName + " 에너지를 " + amount + " 생산했습니다.");
    }

    public abstract void produceEnergy(int n);
}
