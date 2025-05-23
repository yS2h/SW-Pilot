package step03;

import java.util.ArrayList;
import java.util.List;

public class EnergyManager {
    List<EnergySource> sourceList = new ArrayList<>();

    public void addSource(EnergySource source) {
        sourceList.add(source);
    }

    public int sumTotalEnergy() {
        int sum = 0;
        for (EnergySource source : sourceList) {
            sum += source.getEnergyAmount();
        }
        return sum;
    }
}
