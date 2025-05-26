package step03.p05;

public class BiodomeFamily05 {
    public static void main(String[] args) {
        Sorcerer ariel = new Sorcerer("아리엘");
        SolarStone s = new SolarStone();
        WindAmulet a = new WindAmulet();
        WaterMirror m = new WaterMirror();

        ariel.addArtifact(s);
        ariel.addArtifact(a);
        ariel.addArtifact(m);

        ariel.checkArtifact(s);

        ariel.useGenerateEnergy(m);
        ariel.useWeatherController(a);

        s.charge(50);
        m.charge(30);
        s.charge(10);

        System.out.println(s.getName() + "에 총 " + s.getChargeLevel() + "만큼의 에너지가 충전되었습니다.");
        System.out.println(m.getName() + "에 총 " + m.getChargeLevel() + "만큼의 에너지가 충전되었습니다.");

        Chargeable.showChargingTips();
    }
}
