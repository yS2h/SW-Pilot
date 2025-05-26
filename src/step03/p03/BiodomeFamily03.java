package step03.p03;

public class BiodomeFamily03 {
    public static void main(String[] args) {
        LifeNest nest = new LifeNest();

        Animal a = new Animal("펭귄", "남극", "육식", "물고기");
        Animal b = new Animal("코알라", "호주", "초식", "유칼립투스");
        Plant c = new Plant("선인장", "사막", "11월", "열매 있음");
        Plant d = new Plant("페퍼민트", "정원", "7월", "열매 없음");
        Mammal e = new Mammal("사자", "초원", "육식", "고기", true);
        Bird f = new Bird("앵무새", "열대우림", "초식", "씨앗", 3);
        Fish g = new Fish("고등어", "바다", "잡식", "플랑크톤", 5);

        nest.addOrganism(a);
        nest.addOrganism(b);
        nest.addOrganism(c);
        nest.addOrganism(d);
        nest.addOrganism(e);
        nest.addOrganism(f);
        nest.addOrganism(g);

        nest.displayAll();

        nest.removeOrganism(b);
        nest.removeOrganism(c);

        nest.displayAll();

        e.giveBirth();
        f.fly();
        g.swim();
    }
}
