package step03.p05;

public class WindAmulet extends AncientArtifact implements WeatherController {
    public WindAmulet() {
        super("바람의 부적");
        System.out.println(getName() + " 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"" + getName() + "으로 날씨 조정 중! 주변 공기의 흐름을 이용해 날씨를 조절합니다.\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("\"" + getName() + "을 이용해 주변 공기로 날씨를 조절했습니다!\"");
    }
}
