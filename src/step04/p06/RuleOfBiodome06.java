package step04.p06;

public class RuleOfBiodome06 {
    public static void main(String[] args) {
        AnimalFrequencyAnalyzer analyzer = new AnimalFrequencyAnalyzer();

        for (String s : args) {
            s = s.replace(",", "");
            analyzer.update(s);
        }

        System.out.println("가장 많이 발견된 동물 : " + analyzer.mostFrequentAnimal());
        analyzer.print();
    }
}
