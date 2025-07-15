package step06.p07;

public class EnergyManageCenter {
    private static EnergyManageCenter instance = new EnergyManageCenter();
    private int totalEnergy = 5000;

    public static EnergyManageCenter getInstance() {
        return instance;
    }

    public int allocateEnergy(int amount) {
        if (amount < 0) {
            System.out.println("요청된 에너지가 마이너스 값입니다.");
        } else if (amount > totalEnergy) {
            System.out.println("요청된 에너지가 중앙 센터의 보유 에너지보다 많습니다.");
        } else {
            totalEnergy -= amount;
        }
        return totalEnergy;
    }

    public int getTotalEnergy() {
        return totalEnergy;
    }
}
