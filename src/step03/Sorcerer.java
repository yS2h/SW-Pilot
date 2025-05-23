package step03;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer {
    List<AncientArtifact> artifactList = new ArrayList<>();
    private String name;

    public Sorcerer(String name) {
        this.name = name;
        System.out.println("마법사 '" + name + "'이 생성되었습니다.");
    }

    public void addArtifact(AncientArtifact artifact) {
        artifactList.add(artifact);
        System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "을 소유하게 되었습니다.");
    }

    public void checkArtifact(AncientArtifact artifact) {
        System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "의 능력을 확인합니다.");
        artifact.describe();
    }

    public void useGenerateEnergy(AncientArtifact artifact) {
        System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "의 에너지 생성 능력을 사용합니다.");
        ((EnergyGenerator) artifact).generateEnergy();

    }

    public void useWeatherController(AncientArtifact artifact) {
        System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "의 날씨 조절 능력을 사용합니다.");
        ((WeatherController) artifact).controlWeather();
    }
}
