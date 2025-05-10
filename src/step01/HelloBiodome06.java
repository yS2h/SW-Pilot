package step01;

public class HelloBiodome06 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
            return;
        }

        String gene1 = args[0];
        String gene2 = args[1];

        int i = 0;
        while (i < gene1.length()) {
            if (gene1.charAt(i) != gene2.charAt(i)) {
                System.out.println("일치하지 않습니다.");
                return;
            }
            i++;
        }
        System.out.println("동일한 유전자 코드입니다.");
    }
}
