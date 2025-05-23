package step03;

public class BiodomeFamily04 {
    public static void main(String[] args) {
        SolarEnergy s = new SolarEnergy();
        WindEnergy w = new WindEnergy();
        GeothermalEnergy g = new GeothermalEnergy();

        EnergyManager m = new EnergyManager();

        s.produceEnergy(5);
        w.produceEnergy(12);
        g.produceEnergy(4);

        s.useEnergy(30);
        w.useEnergy(30);
        g.useEnergy(30);

        m.addSource(s);
        m.addSource(w);
        m.addSource(g);
        
        System.out.println("남은 에너지: " + m.sumTotalEnergy());
    }
}
