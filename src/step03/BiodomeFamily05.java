package step03;

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
    }
}
