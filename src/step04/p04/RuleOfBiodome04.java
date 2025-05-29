package step04.p04;

public class RuleOfBiodome04 {
    public static void main(String[] args) {
        BiologicalEntity<AnimalFeature> a = new BiologicalEntity<>("고양이", "동물", new AnimalFeature("귀여움", "포유류", 20));
        BiologicalEntity<AnimalFeature> b = new BiologicalEntity<>("얼룩말", "동물", new AnimalFeature("잘 달린다", "포유류", 10));
        BiologicalEntity<PlantFeature> c = new BiologicalEntity<>("로즈마리", "식물", new PlantFeature("보라색", false, 7));
        BiologicalEntity<PlantFeature> d = new BiologicalEntity<>("벚꽃", "식물", new PlantFeature("분홍색", true, 3));
        BiologicalEntity<MicrobeFeature> e = new BiologicalEntity<>("이콜라이", "미생물", new MicrobeFeature("약 산성", "호흡 및 발효 대사"));
        BiologicalEntity<MicrobeFeature> f = new BiologicalEntity<>("바실러스", "미생물", new MicrobeFeature("약 산성", "호흡 대사"));


        BiologicalSystem bs = new BiologicalSystem();

        bs.add(a);
        bs.add(b);
        bs.add(c);
        bs.add(d);
        bs.add(e);
        bs.add(f);

        bs.delete(f);

        bs.show();

        bs.isEmpty();
        bs.clear();
        bs.isEmpty();
    }
}
