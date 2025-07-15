package step06.p07;

public class City {
    private String name;
    private int amount;

    public City(String name) {
        this.name = name;
        this.amount = 0;
    }

    public void requestEnergy(int amount) {
        EnergyManageCenter center = EnergyManageCenter.getInstance();
        int before = center.getTotalEnergy();
        int after = center.allocateEnergy(amount);

        if (before != after)
            this.amount += amount;

        System.out.println("중앙 에너지 센터: " + after);
        printEnergy();
    }

    public void printEnergy() {
        System.out.println(name + ": " + amount);
    }
}
