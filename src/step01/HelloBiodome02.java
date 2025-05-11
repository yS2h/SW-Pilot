package step01;

public class HelloBiodome02 {
    public static void main(String[] args) {
        try {
            int solar, wind, geo, sum;
            solar = Integer.parseInt(args[0]);
            wind = Integer.parseInt(args[1]);
            geo = Integer.parseInt(args[2]);
            sum = solar + wind + geo;
            System.out.println("총 에너지 사용량은 " + (solar + wind + geo) + "입니다.");
            System.out.println("태양광" + (double) solar / sum * 100 + "풍력" + (double) wind / sum * 100 + "지열" + (double) geo / sum * 100);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해 주세요");
        }
    }
}
