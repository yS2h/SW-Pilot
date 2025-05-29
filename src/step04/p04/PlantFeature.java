package step04.p04;

public class PlantFeature {
    private String flowerColor;
    private boolean hasFruit;
    private int floweringTime;

    public PlantFeature(String flowerColor, boolean hasFruit, int floweringTime) {
        this.flowerColor = flowerColor;
        this.hasFruit = hasFruit;
        this.floweringTime = floweringTime;
    }

    @Override
    public String toString() {
        return flowerColor + ", " + (hasFruit ? "열매 있음" : "열매 없음") + ", " + floweringTime + "년";
    }
}
