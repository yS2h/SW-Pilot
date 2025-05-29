package step04.p05;

public class RuleOfBiodome05 {
    public static void main(String[] args) {
        PlantHashMap<String, String> map = new PlantHashMap<>();

        map.put("장미", "장미는 관상용으로 많이 재배되는 화초 중 하나이다.");
        map.put("해바라기", "해바라기는 태양을 따라 움직이는 것으로 알려져 있다.");
        map.put("민들레", "민들레는 약용으로도 사용되는 풀이다.");
        map.put("개나리", "개나리는 봄에 노랗게 피며 담장 주변에서 자주 볼 수 있다.");
        map.put("국화", "국화는 가을을 대표하는 꽃으로 향기가 은은하다.");
        map.put("카네이션", "카네이션은 스승의 날이나 어버이날에 선물로 많이 사용된다.");
        map.put("대나무", "대나무는 마디가 뚜렷하고 곧게 자란다.");
        map.put("쑥", "쑥은 봄철 나물로 떡이나 찜에도 사용된다.");
        map.put("상추", "상추는 비타민이 풍부해 쌈 채소로 자주 먹는다.");
        map.put("무궁화", "무궁화는 우리나라를 상징하는 꽃이다.");
        System.out.println("(10개 식물 데이터가 모두 추가됨)\n");

        System.out.println("(식물 특징 검색)");
        map.get("장미");
        map.get("해바라기");

        System.out.println("\n(식물 삭제)");
        map.remove("민들레");

        System.out.println("\n(식물 이름으로 인덱스 출력)");
        map.printIndex("장미");
        map.printIndex("해바라기");
    }
}
