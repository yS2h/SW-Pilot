package step03;

public class WaterMirror extends AncientArtifact implements EnergyGenerator, WeatherController {
    public WaterMirror() {
        super("물의 거울");
        System.out.println(getName() + " 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"" + getName() + "로 에너지 생성과 날씨 조정 중! 습도에 영향을 받고 비와 눈을 내립니다.\"");
    }

    @Override
    public void generateEnergy() {
        System.out.println("\"" + getName() + "을 이용해 수증기로 에너지를 생성했습니다!\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("\"" + getName() + "을 이용해 비와 눈을 내렸습니다!\"");
    }
}
